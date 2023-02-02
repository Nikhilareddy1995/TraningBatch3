package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.service.EmployeeService;

@RestController
public class HelloController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/hi")
	public String sayHi() {
		return "Hello World";
	}

	@PostMapping("/saveEmployee")
	public String saveData(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmpData(employeeDto);
	}

}
