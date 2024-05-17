package com.employee.RegisterLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.RegisterLogin.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
