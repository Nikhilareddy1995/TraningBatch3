package com.day6;

import java.util.ArrayList;
import java.util.List;
//1.5v- Generics-- to restrict to store multiple kind of data- to provide safety and to overcome type casting
public class GenericsExample {
	int a;//Integer
	String b;
	char c;//character
	Integer d;
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList();
		Employee e=new Employee(1, "uhu");
		// List arrayList2 = new ArrayList();
		//int, String, char
		//arrayList.add(123);
		//arrayList.add("hduihi");
		//arrayList.add('C');
		//internally it will call toString method
		arrayList.add(e);
		
		for(int i=0;i<arrayList.size();i++) {
			Employee a= arrayList.get(i);//type cast is mandatory
		}

	}

}

class Employee {
	int id;
	String name;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return id+" "+name;
}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
