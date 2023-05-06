package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department_info")
public class Department implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6849547092415845555L;
	// primarykey for rference
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long deptId;
	@Column(name = "dept_name")
	private String name;
	private String address;
	private int count;

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

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

}
