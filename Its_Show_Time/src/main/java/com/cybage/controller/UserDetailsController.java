package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.entity.UserDetailsEntity;
import com.cybage.service.UserDetailsServiceImpl;

@RestController
public class UserDetailsController {
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@PostMapping("/newUser")
	public String addNewUser(@RequestBody UserDetailsEntity userDetailsEntity) {
		String message = userDetailsService.addUser(userDetailsEntity);
		return message;
	}

}
