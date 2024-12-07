package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Employee;

public interface EmployeeService 
{
	public String addemployee(Employee e);
	public String updateemployee(Employee e);
	public String deleteemployee(int eid);
	public List<Employee> viewallEmployees();
	public Employee viewEmployeebyid(int eid);
}
