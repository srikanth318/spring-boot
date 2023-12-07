package com.employee.app.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.app.response.AddressResponse;

@FeignClient(name = "ADDRESS-SERVICE",url="http://localhost:8082/")
public interface AddressClient {
	
	//http://localhost:8082/address/1
	 
	@GetMapping("/address/{employeeId}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id);

}
