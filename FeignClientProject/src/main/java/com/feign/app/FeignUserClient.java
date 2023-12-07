package com.feign.app;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "",name = "")
public interface FeignUserClient {

	@GetMapping("/getUsers")
	public UserDto getUsers();
}
