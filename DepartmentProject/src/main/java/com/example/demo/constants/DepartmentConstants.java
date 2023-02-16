package com.example.demo.constants;

public enum DepartmentConstants {
	FILED_VALIDATION_FAIL_CODE("VALIDATION_FAIL"), 
	INVALID_DEPT_ID("INVALID_DEPARTMENT_ID"),
	INVALID_DEPT_ID_MSG("Department details is not found with provided deptId");

	private String stringValue;

	private DepartmentConstants(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	private DepartmentConstants() {
	}

}
