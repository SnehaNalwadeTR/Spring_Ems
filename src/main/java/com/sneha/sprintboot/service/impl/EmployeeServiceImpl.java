package com.sneha.sprintboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sneha.sprintboot.exception.ResourceNotFoundException;
import com.sneha.sprintboot.model.Employee;
import com.sneha.sprintboot.repository.EmployeeRepository;
import com.sneha.sprintboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeRepository employeeRepository;
   
   
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}
	@Override
	public Employee saveEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}
	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employees", "id", id));
	}
	@Override
	public Employee updateEmployee(Employee employee, long id) {
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employees", "id", id));
		return employeeRepository.save(employee);
	}
	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employees", "id", id));
		employeeRepository.deleteById(id);
	}

}
