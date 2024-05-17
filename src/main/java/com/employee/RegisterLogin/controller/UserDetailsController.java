package com.employee.RegisterLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.RegisterLogin.dto.LoginDTO;
import com.employee.RegisterLogin.dto.UserDetailsDTO;
import com.employee.RegisterLogin.response.LoginResponse;
import com.employee.RegisterLogin.service.UserDetailsInterService;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/user")
public class UserDetailsController {
	
	@Autowired
	private UserDetailsInterService userDetailsInterService;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDetailsDTO userDetailsDTO) {
		
		String id = userDetailsInterService.addUser(userDetailsDTO);
		
		return id;
		
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
		
		LoginResponse loginResponse = userDetailsInterService.loginUser(loginDTO);
		
		return ResponseEntity.ok(loginResponse);
		
	}

}
