package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.dao.EmployeeDAO;
import com.klef.jfsd.model.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public String addemployee(Employee e) 
	{
		return employeeDAO.addemployee(e);
	}

	@Override
	public String updateemployee(Employee e) 
	{
		return employeeDAO.updateemployee(e);
	 }

	@Override
	public String deleteemployee(int eid) 
	{
		return employeeDAO.deleteemployee(eid);
	}

	@Override
	public List<Employee> viewallEmployees() 
	{
		return employeeDAO.viewallEmployees();
	}

	@Override
	public Employee viewEmployeebyid(int eid) 
	{
		return employeeDAO.viewEmployeebyid(eid);
	}

}
