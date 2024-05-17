package com.employee.RegisterLogin.service;

import java.util.Optional;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.employee.RegisterLogin.dto.LoginDTO;
import com.employee.RegisterLogin.dto.UserDetailsDTO;
import com.employee.RegisterLogin.entity.UserDetails;
import com.employee.RegisterLogin.repo.UserDetailsRepo;
import com.employee.RegisterLogin.response.LoginResponse;

@Service
public class UserDetailsService implements UserDetailsInterService {
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	@Autowired(required=true)
	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDetailsDTO userDetailsDTO) {

		UserDetails userDetails = new UserDetails(userDetailsDTO.getId(), userDetailsDTO.getUserName(),
				userDetailsDTO.getEmail(), 
				this.passwordEncoder.encode(userDetailsDTO.getPassword()));
		
		userDetailsRepo.save(userDetails);
		
		return userDetails.getUserName();
	}

	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		
		
		UserDetails User1 = userDetailsRepo.findByEmail(loginDTO.getEmail());
		
		if(User1 != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = User1.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			
			if(isPwdRight) {
				Optional<UserDetails> user = userDetailsRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
				if(user.isPresent()) {
					return new LoginResponse("Login Success", true);
				}else {
					return new LoginResponse("Login Failed", false);
				}
			}else {
				
				return new LoginResponse("password Not Match", false);
			}
		}else {
			
			return new LoginResponse("Email not exists", false);
		}
	}

}
