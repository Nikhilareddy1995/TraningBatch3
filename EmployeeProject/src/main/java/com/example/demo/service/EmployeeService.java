package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	public String saveEmpData(EmployeeDto employeeDto) {
		Employee e = new Employee();
		e.setAddress(employeeDto.getAddress());
		e.setName(employeeDto.getName());
		e.setSalary(employeeDto.getSalary());
		employeeRepository.save(e);
		return "Saved emp data into DB successfully";
	}

}
