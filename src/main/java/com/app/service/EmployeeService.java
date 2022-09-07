package com.app.service;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeService {
	
	Employee saveEmp(Employee emp);
	String deleteEmp(Long id);
	Employee upDateEmp(Employee emp);
	List<Employee> getAllEmployees();
	Employee getById(Long id);

}
