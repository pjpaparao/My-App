package com.app.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.jpa.EmployeeRepository;
import com.app.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public Employee saveEmp(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Long deleteEmp(Long id) {
		Employee existingEmployee = empRepo.findById(id).orElse(null);
		if(Objects.nonNull(existingEmployee)) {
		empRepo.deleteById(id);
		return empRepo.count();
		}
		return null;
	}

	@Override
	public Employee upDateEmp(Employee emp) {
		Employee existingEmployee = empRepo.findById(emp.getTicketId()).orElse(null);
//		existingEmployee.setDob(emp.getDob());
//		existingEmployee.setFirstName(emp.getFirstName());
//		existingEmployee.setLastName(emp.getLastName());
//		existingEmployee.setSalary(emp.getSalary());
		existingEmployee = emp;
		return empRepo.save(existingEmployee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee getById(Long id) {
		return empRepo.findById(id).get();
	}

	
}
