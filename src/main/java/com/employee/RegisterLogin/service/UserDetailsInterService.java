package com.employee.RegisterLogin.service;

import org.springframework.stereotype.Service;


import com.employee.RegisterLogin.dto.LoginDTO;
import com.employee.RegisterLogin.dto.UserDetailsDTO;
import com.employee.RegisterLogin.response.LoginResponse;

@Service
public interface UserDetailsInterService {

	String addUser(UserDetailsDTO userDetailsDTO);

	LoginResponse loginUser(LoginDTO loginDTO); 

}
