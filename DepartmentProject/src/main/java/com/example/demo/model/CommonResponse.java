package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CommonResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6178907798203401853L;
	
	private ErrorResponse error;
	
	private transient Object response;
	
	private int status; 

	private LocalDateTime responseTimestamp;

	private String path;
	
	public CommonResponse() {
		super();
	}

	public CommonResponse(ErrorResponse error, Object response, int status, String path) {
		super();
		this.error = error;
		this.response = response;
		this.status = status;
		this.path = path;
	}

	public ErrorResponse getError() {
		return error;
	}

	public void setError(ErrorResponse error) {
		this.error = error;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LocalDateTime getResponseTimestamp() {
		responseTimestamp = LocalDateTime.now();
		return responseTimestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
