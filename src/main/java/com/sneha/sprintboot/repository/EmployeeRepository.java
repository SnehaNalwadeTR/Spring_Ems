package com.sneha.sprintboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneha.sprintboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
	
}
