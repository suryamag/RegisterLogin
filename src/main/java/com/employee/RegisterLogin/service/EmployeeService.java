package com.employee.RegisterLogin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.RegisterLogin.dto.EmployeeDTO;
import com.employee.RegisterLogin.dto.SaveEmployeeDTO;
import com.employee.RegisterLogin.entity.Employee;
import com.employee.RegisterLogin.repo.EmployeeRepo;

@Service
public class EmployeeService implements EmployeeInterService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String addEmp(SaveEmployeeDTO saveEmployeeDTO) {

		Employee employee = new Employee(saveEmployeeDTO.getName(), saveEmployeeDTO.getAge(),
				saveEmployeeDTO.getGender(), saveEmployeeDTO.getMobile());

		employeeRepo.save(employee);

		return employee.getName() + "---added";
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {

		List<Employee> getemp = employeeRepo.findAll();

		List<EmployeeDTO> employeeDTOList = new ArrayList();

		for (Employee emp : getemp) {

			EmployeeDTO employeeDTO = new EmployeeDTO(emp.getId(), emp.getName(), emp.getAge(), emp.getGender(),
					emp.getMobile());

			employeeDTOList.add(employeeDTO);
		}
		return employeeDTOList;
	}

	@Override
	public String updateEmployee(EmployeeDTO employeeDTO) {
		
		if(employeeRepo.existsById(employeeDTO.getId())) {
			
			Employee employee = employeeRepo.getById(employeeDTO.getId()) ;
			
			employee.setName(employeeDTO.getName());
			employee.setAge(employeeDTO.getAge());
			employee.setGender(employeeDTO.getGender());
			employee.setMobile(employeeDTO.getMobile());
			employeeRepo.save(employee);
		}else {
			System.out.println("ID is not avilable..");
		}
		
		return "Employee details chacged";
	}

	@Override
	public boolean deleteEmployee(int id) {
		
		
		if(employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			
		}
		else {
			System.out.println("Employee id not fount");
		}
		
		return false;
	}

}
