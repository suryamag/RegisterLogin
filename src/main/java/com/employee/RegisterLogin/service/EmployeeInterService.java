package com.employee.RegisterLogin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.RegisterLogin.dto.EmployeeDTO;
import com.employee.RegisterLogin.dto.SaveEmployeeDTO;

@Service
public interface EmployeeInterService {

	String addEmp(SaveEmployeeDTO saveEmployeeDTO);

	List<EmployeeDTO> getAllEmployee();

	String updateEmployee(EmployeeDTO employeeDTO);

	boolean deleteEmployee(int id);

}
