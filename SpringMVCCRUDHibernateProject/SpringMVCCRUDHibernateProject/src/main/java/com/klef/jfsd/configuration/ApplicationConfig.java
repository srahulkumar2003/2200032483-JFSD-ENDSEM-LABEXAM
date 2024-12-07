package com.klef.jfsd.configuration;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.dao.EmployeeDAOImpl;
import com.klef.jfsd.service.EmployeeService;
import com.klef.jfsd.service.EmployeeServiceImpl;

@Configuration
@EnableTransactionManagement
public class ApplicationConfig 
{
	    //dbcp - database connection pool
	    @Bean
	    public BasicDataSource dataSource() 
	    {
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");  // driver class
	        dataSource.setUrl("jdbc:mysql://localhost:3306/springmvchibernate11");  // url
	        dataSource.setUsername("root");  // user 
	        dataSource.setPassword("root"); // password
	        return dataSource;
	    }

	    @Bean
	    public Properties hibernateProperties() 
	    {
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.setProperty("hibernate.show_sql", "true");
	        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	        return hibernateProperties;
	    }

	    @Bean
	    public LocalSessionFactoryBean localSessionFactoryBean() 
	    {
	        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
	        localSessionFactoryBean.setDataSource(dataSource());  // first bean
	        localSessionFactoryBean.setHibernateProperties(hibernateProperties()); // second bean
	        localSessionFactoryBean.setPackagesToScan("com.klef.jfsd.model"); // mapping
	        return localSessionFactoryBean;
	    }

	    @Bean
	    public HibernateTransactionManager hibernateTransactionManager() 
	    {
	        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(localSessionFactoryBean().getObject());
	        return transactionManager;
	    }

	    @Bean
	    public HibernateTemplate hibernateTemplate() 
	    {
	        HibernateTemplate hibernateTemplate = new HibernateTemplate();
	        hibernateTemplate.setSessionFactory(localSessionFactoryBean().getObject());
	        return hibernateTemplate;
	    }
	    
	    @Bean
	    public EmployeeDAO employeeDAO()
	    {
	    	EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
	    	daoImpl.setHibernateTemplate(hibernateTemplate());
	    	return daoImpl;
	    }
	    
	    @Bean
	    public EmployeeService employeeService()
	    {
	    	EmployeeServiceImpl serviceImpl = new EmployeeServiceImpl();
	    	serviceImpl.setEmployeeDAO(employeeDAO());
	    	return serviceImpl;
	    }

}
