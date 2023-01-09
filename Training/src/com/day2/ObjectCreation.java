package com.day2;

public class ObjectCreation {

	// constructor--similar to method but it doesnt contain the return statement and
	// method name should be same as class name
	// constructor overloading
	// generally JVM will provide us default constructor if we dont have any
	// constructor

	public ObjectCreation(int a) {
		System.out.println("hello");
	}

	public ObjectCreation() {
	}

	public static void main(String[] args) {
		// default object
		// default, customized
		ObjectCreation objectCreation1 = new ObjectCreation(10);// implicitly it will call constructor
		ObjectCreation objectCreation2 = new ObjectCreation();
	}

}
