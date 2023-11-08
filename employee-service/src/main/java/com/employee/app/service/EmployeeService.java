package com.employee.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.app.entity.Employee;
import com.employee.app.repo.EmployeeRepo;
import com.employee.app.response.AddressResponse;
import com.employee.app.response.EmployeeResponse;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	public EmployeeResponse getEmployeeById(int id) 
	{
		Employee employee = employeeRepo.findById(id).get();
		EmployeeResponse response = modelMapper.map(employee, EmployeeResponse.class);
		
		AddressResponse addressResponse = restTemplate.getForObject("http://localhost:8081/address-app/api/address/{id}", AddressResponse.class, id);
		
		response.setAddressResponse(addressResponse);
		
		return response;
	}
}
