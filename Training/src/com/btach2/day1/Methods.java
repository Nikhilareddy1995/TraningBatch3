package com.btach2.day1;

public class Methods {
// access specifer + return type + arguments/parameters
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(int nikhil, int num2,int num) {
		System.out.println( num2);
	}

	public void add(String num1, int num2) {
		System.out.println("dhfj");

	}

	public static void sub(String num1, int num2) {
		System.out.println("dhfj");

	}

//JVM
	public static void main(String[] args) {
//Object creation
		Methods methods = new Methods();// allocate memory in heap
		methods.add(586785, 986579867);
		methods.add("fjdhf", 77);
		sub("jdhg", 33);
	}

}

//lap--
//hp, dell-->object
