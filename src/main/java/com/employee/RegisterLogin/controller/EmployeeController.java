package com.employee.RegisterLogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.RegisterLogin.dto.EmployeeDTO;
import com.employee.RegisterLogin.dto.SaveEmployeeDTO;
import com.employee.RegisterLogin.service.EmployeeInterService;

@RestController
@RequestMapping(value = "/api/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeInterService employeeInterService;
	
	
	@PostMapping("/save")
	public String addEmployee(@RequestBody SaveEmployeeDTO saveEmployeeDTO ) {
		
		String id = employeeInterService.addEmp(saveEmployeeDTO);
		
		return id;
		
	}
	
	
	@GetMapping("/get")
	public List<EmployeeDTO> getAllStudent() {
		
		List<EmployeeDTO> allEmployee = employeeInterService.getAllEmployee();
		
		return allEmployee;
		
	}
	
	@PostMapping("/update")
	public String updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
		String id = employeeInterService.updateEmployee(employeeDTO);
		
		
		return id;
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		
		boolean deleteStudent = employeeInterService.deleteEmployee(id);
		
		
		return "deleted";
	}

}
