package com.sneha.sprintboot.service;

import java.util.List;

import com.sneha.sprintboot.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	public List<Employee> getEmployees();
	public Employee getEmployeeById(long id);
	public Employee updateEmployee(Employee employee, long id);
	public void deleteEmployee(long id);
}
