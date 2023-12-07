package com.employee.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.app.entity.Employee;
import com.employee.app.feignclient.AddressClient;
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
	private AddressClient addressClient;
	
	public EmployeeResponse getEmployeeById(int id) 
	{
		Employee employee = employeeRepo.findById(id).get();
		EmployeeResponse response = modelMapper.map(employee, EmployeeResponse.class);
		
		ResponseEntity<AddressResponse> addressByEmployeeId = addressClient.getAddressByEmployeeId(id);
		AddressResponse addressResponse = addressByEmployeeId.getBody();
		
		
		response.setAddressResponse(addressResponse);
		
		return response;
	}
}
