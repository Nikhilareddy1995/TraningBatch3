package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.model.DeptDto;
import com.example.demo.model.PatchDeptDto;
import com.example.demo.model.UpdateDeptDto;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// will expose HTTP methods-- GET,PUT,POST,patch and delete
	@GetMapping
	public ResponseEntity<String> print() {
		return new ResponseEntity<String>("My First method", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Department> getDepartemnt(@PathVariable Long id) {
		Department department = departmentService.getDepartment(id);
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Department> saveDepartment(@Valid @RequestBody DeptDto deptDto) {
		Department department = departmentService.saveDept(deptDto);
		return new ResponseEntity<Department>(department, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Department> updateDepartment(@Valid @RequestBody UpdateDeptDto deptDto) {
		Department department = departmentService.updateDepartment(deptDto);
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@PatchMapping
	public ResponseEntity<Department> updateDepartmentPartially(@Valid @RequestBody PatchDeptDto abc) {
		Department department = departmentService.updateDepartmentWithFewDeatils(abc);
		System.out.println("NIkhila");
		return new ResponseEntity<Department>(department, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
		String message = departmentService.deleteDepartment(id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}
