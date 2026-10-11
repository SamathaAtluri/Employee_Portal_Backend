package com.vcube.EmployeePortal.service;

import java.util.List;

import com.vcube.EmployeePortal.model.Employee;

public interface EmployeeService {
	
	
	public abstract Employee addEmployee(Employee employee);
	
	public abstract List<Employee> getAllEmployeesInfo();
	
	public abstract Employee getEmployee(Integer id);
	
	public abstract Employee updateEmployee(Employee e,Integer id);
	
	public abstract void deleteEmployee(Integer id);
	
	

}
