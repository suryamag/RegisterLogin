package com.employee.RegisterLogin.dto;

public class SaveEmployeeDTO {
	

	private String name;
	private int age;
	private String gender;
	private String mobile;
	
	
	public SaveEmployeeDTO(int id, String name, int age, String gender, String mobile) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
	}

	public SaveEmployeeDTO() {
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
		return "getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getGender()=" + getGender() + ", getMobile()=" + getMobile() + "]";
	}
	
	
	



}
