package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import com.example.vo.EmployeeRequestVo;

import jakarta.transaction.Transactional;

@Service

public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public DepartmentRepository departmentRepository;
	
	@Transactional
	public String saveEmployee(EmployeeRequestVo employeeRequestVo) {
		
		Department d = new Department();
		
		d.setDepartmentName(employeeRequestVo.getDepartmentName());
		d.setDepartmentCode(employeeRequestVo.getDepartmentName());
		
		Long departmentId = departmentRepository.save(d).getDepartmentId();
		
		Employee e = new Employee();
		
		e.setEmpName(employeeRequestVo.getEmpName());
		e.setEmail(employeeRequestVo.getEmail());
		e.setDepartmentId(departmentId);
		
		Long empId = employeeRepository.save(e).getEmpId();
		
		return "employee data succefully saved with id :: "+empId;
		
	}

}
