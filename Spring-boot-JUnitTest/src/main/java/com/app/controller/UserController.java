package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getData")
	public String getName() {

		return "srikanth kuluri";
	}

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {

		return userService.saveUserDetails(user);
	}

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
	
		return userService.getAllUsers();
	}
	
	
	
}
