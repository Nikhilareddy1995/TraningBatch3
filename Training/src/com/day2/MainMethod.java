package com.day2;

public class MainMethod {

	int a = 10;
	int b = 10;

	// method overloading -> method names are same but we should pass diffrent arguments
	public void add(int a, int b) {
		System.out.println(a - b);
		System.out.println("hi");
	}

	public void add(int a, long india) {
		System.out.println(a + india);
	}

	public static void add(int atyury, long india, int c) {
		System.out.println(atyury + india + c);
	}

	// main method signature--public static void
	// static keyword-- without object wil call methods
	public static void main(String[] args) {
		System.out.println("hi");

		// default object creation
		MainMethod mainMethod = new MainMethod();// allocate--heap
		mainMethod.add(12, 3546);
		mainMethod.add(1213, 345398576956795l);
		MainMethod.add(1, 2, 3);
		add(1, 2, 3);

	}
}
