package com.employee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
