package com.day3;
//multiple inheritence will acheive through interfaces
public class Abstraction implements B, C {

	@Override
	public void add(int a, int b) {

	}

	@Override
	public void sub(int a, int b) {

	}

	// abstract classes and interfaces

}

class A {

	public void add(int b, int bn) {
		System.out.println("hello");
	}
}

class E {
	public void add(int b, int bn) {
		System.out.println("hi");
	}
}

//100%
interface B {
	public void add(int a, int b);

}

interface C {
	public void add(int a, int c);

	public void sub(int a, int b);
}

//0 to 100%
abstract class D {
	public abstract void add(int a, int b);

	public void sub(int a, int b) {

	}

	public void mul(int a, int b) {

	}

	public void div(int a, int b) {

	}
}
