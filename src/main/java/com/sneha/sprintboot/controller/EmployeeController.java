package com.sneha.sprintboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sneha.sprintboot.model.Employee;
import com.sneha.sprintboot.service.EmployeeService;

@RestController
public class EmployeeController {

	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping()
	//build create employee rest api
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/")
	public String getMessage() {
		return "hello from controller";
	}
	/*
	 * public ResponseEntity<Employee> getEmployees() { return new
	 * ResponseEntity<Employee>(employeeService.getEmployees(), HttpStatus.OK); }
	 */
}
