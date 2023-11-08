package com.employee.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.app.response.AddressResponse;
import com.employee.app.response.EmployeeResponse;
import com.employee.app.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeDeatails(@PathVariable("id") int id) {

		EmployeeResponse response = employeeService.getEmployeeById(id);

		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
