package com.example.demo.model;

import javax.validation.constraints.NotBlank;

public class UpdateDeptDto {

	@NotBlank(message = "Name is mandatory field")
	private String name;
	private String address;
	private int count;
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
