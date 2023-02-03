package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
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
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable long id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping("/updateEmployee")
	public Employee getEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.updateEmployeeById(employeeDto);
	}
	
	@PatchMapping("/updateEmployee")
	public Employee updateEmp(@RequestBody EmployeeDto employeeDto) {
		return employeeService.updateEmpDataByPatch(employeeDto);
	}
	

}
