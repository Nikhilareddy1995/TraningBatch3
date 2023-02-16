package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.DepartmentNotFoundException;
import com.example.demo.constants.DepartmentConstants;
import com.example.demo.entity.Department;
import com.example.demo.model.DeptDto;
import com.example.demo.model.PatchDeptDto;
import com.example.demo.model.UpdateDeptDto;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDept(DeptDto dto) {
		Department department = new Department();
		department.setAddress(dto.getAddress());
		department.setCount(dto.getCount());
		department.setName(dto.getName());
		return departmentRepository.save(department);

	}

	public Department updateDepartment(UpdateDeptDto dto) {
		Optional<Department> optionalDept = departmentRepository.findById(dto.getId());
		if (optionalDept.isPresent()) {
			Department department = optionalDept.get();
			department.setAddress(dto.getAddress());
			department.setCount(dto.getCount());
			department.setName(dto.getName());
			department.setDeptId(dto.getId());
			return departmentRepository.save(department);
		} else {
			throw new DepartmentNotFoundException(DepartmentConstants.INVALID_DEPT_ID_MSG.getStringValue());
		}

	}

	public Department updateDepartmentWithFewDeatils(PatchDeptDto dto) {
		Optional<Department> optionalDept = departmentRepository.findById(dto.getId());
		if (optionalDept.isPresent()) {
			Department department = optionalDept.get();
			department.setName(dto.getName());
			return departmentRepository.save(department);
		} else {
			throw new DepartmentNotFoundException(DepartmentConstants.INVALID_DEPT_ID_MSG.getStringValue());
		}

	}

	public String deleteDepartment(Long id) {
		Optional<Department> optionalDept = departmentRepository.findById(id);
		if (optionalDept.isPresent()) {
			departmentRepository.delete(optionalDept.get());
			return "Deleted successfully";
		} else {
			throw new DepartmentNotFoundException(DepartmentConstants.INVALID_DEPT_ID_MSG.getStringValue());
		}

	}

	public Department getDepartment(Long id) {
		Optional<Department> optionalDept = departmentRepository.findById(id);
		if (optionalDept.isPresent())
			return optionalDept.get();
		else
			throw new DepartmentNotFoundException(DepartmentConstants.INVALID_DEPT_ID_MSG.getStringValue());

	}

}
