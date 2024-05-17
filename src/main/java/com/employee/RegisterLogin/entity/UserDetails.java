package com.employee.RegisterLogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userDetail")
public class UserDetails {

	@Id
	@Column(name = "id", length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "userName", length = 255)
	private String userName;

	@Column(name = "email", length = 255)
	private String email;

	@Column(name = "password", length = 255)
	private String password;

	public UserDetails(int id, String userName, String email, String password) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public UserDetails() {
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
		return "UserDetails [getId()=" + getId() + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail()
				+ ", getPassword()=" + getPassword() + "]";
	}

}
