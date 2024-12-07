package com.klef.jfsd.dao;

import java.util.List;

import com.klef.jfsd.model.Employee;

public interface EmployeeDAO 
{
	public String addemployee(Employee e);
	public String updateemployee(Employee e);
	public String deleteemployee(int eid);
	public List<Employee> viewallEmployees();
	public Employee viewEmployeebyid(int eid);
}
