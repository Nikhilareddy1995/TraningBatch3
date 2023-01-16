package com.day6;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1123, "hi");
		map.put(1123, "hello");
		map.put(1123, "India");
		System.out.println(map);
	}

}

class Employees{
	int phNo;
	String address;
	String name;
	public Employees(int phNo, String address, String name) {
		super();
		this.phNo = phNo;
		this.address = address;
		this.name = name;
	}
	
}
