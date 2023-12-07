package com.address.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.app.entity.Address;
import com.address.app.repo.AddressRepo;
import com.address.app.response.AddressResponse;

@Service
public class AddressService {

	
	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId (int employeeId) 
	{
		Address address = addressRepo.findAddressByEmployeeId(employeeId);
		AddressResponse response = modelMapper.map(address, AddressResponse.class);
		
		return response;
	}
	
}
