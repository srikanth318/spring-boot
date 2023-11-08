package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;
import com.example.vo.EmployeeRequestVo;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	public EmployeeService employeeService;
	

	@PostMapping("/saveEmp")
	public String saveEmployee(@RequestBody EmployeeRequestVo employeeRequestVo) 
	{
		return employeeService.saveEmployee(employeeRequestVo);
	}
}
