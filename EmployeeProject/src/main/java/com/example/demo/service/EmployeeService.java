package com.example.demo.service;

import java.util.Optional;

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

	public Employee getEmployeeById(long id) {
		Optional<Employee> e = employeeRepository.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public String deleteEmployeeById(long id) {
		Optional<Employee> e = employeeRepository.findById(id);
		if (e.isPresent()) {
			employeeRepository.delete(e.get());
			return "Deleted sucessfully";
		} else {
			return "Employee data is not present in DB with given id";
		}

	}

	public Employee updateEmployeeById(EmployeeDto employeeDto) {
		Optional<Employee> e = employeeRepository.findById(employeeDto.getId());
		if (e.isPresent()) {
			Employee employee = e.get();
			employee.setName(employeeDto.getName());
			employee.setAddress(employeeDto.getAddress());
			employee.setSalary(employeeDto.getSalary());
			employeeRepository.save(employee);
			return employee;
		} else {
			return null;
		}
	}

	public Employee updateEmpDataByPatch(EmployeeDto employeeDto) {
		Optional<Employee> e = employeeRepository.findById(employeeDto.getId());
		if (e.isPresent()) {
			Employee employee = e.get();
			employee.setAddress(employeeDto.getAddress());
			employee.setName("Munagala");

			return employee;
		} else {
			return null;
		}
	}

}
