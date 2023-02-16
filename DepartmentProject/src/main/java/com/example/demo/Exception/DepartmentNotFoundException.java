package com.example.demo.Exception;

public class DepartmentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3056460037859605909L;

	public DepartmentNotFoundException(String msg) {
		super(msg);
	}

}
