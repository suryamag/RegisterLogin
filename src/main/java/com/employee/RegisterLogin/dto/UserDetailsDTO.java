package com.employee.RegisterLogin.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class UserDetailsDTO {
	
	

	private int id;
	private String userName;
	private String email;
	private String password;
	
	public UserDetailsDTO(int id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public UserDetailsDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetailsDTO [getId()=" + getId() + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + "]";
	}
	
	
	
	
	
	
	
	

}
