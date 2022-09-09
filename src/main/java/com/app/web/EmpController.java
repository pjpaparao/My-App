package com.app.web;

import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/emp")
@CrossOrigin(origins="http://localhost:4200")
public class EmpController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/test")
	public String test(){
		return "server up";
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return service.getAllEmployees();
	}
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody() Employee emp){
		return service.saveEmp(emp);
	}
	
	
	@PostMapping("/upDateEmp")
	public Employee updateEmployee(@RequestBody Employee emp){
		return service.upDateEmp(emp);
	}
	
	@GetMapping("/deleteEmp/{id}")
	public Long deleteEmp(@PathVariable("id") Long id){
		return service.deleteEmp(id);
	}
	
	@GetMapping("/get/{id}")
	public Employee getById(@PathParam("id") Long id){
		return service.getById(id);
		
	}

}
