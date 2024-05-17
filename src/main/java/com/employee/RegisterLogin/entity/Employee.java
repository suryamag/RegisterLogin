package com.employee.RegisterLogin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name ="id", length =1000)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="name", length =25)
	private String name;
	
	@Column(name ="age", length =3)
	private int age;
	
	@Column(name ="gender", length =6)
	private String gender;
	
	@Column(name ="mobile", length =10)
	private String mobile;
	
	

	public Employee(int id, String name, int age, String gender, String mobile) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
	}
	
	public Employee(String name, int age, String gender, String mobile) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
	}


	public Employee() {
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getGender()="
				+ getGender() + ", getMobile()=" + getMobile() + "]";
	}
	
	
	
	

}
