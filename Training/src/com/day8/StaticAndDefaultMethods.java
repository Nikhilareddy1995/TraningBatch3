package com.day8;

public class StaticAndDefaultMethods {
	public static void main(String[] args) {

	}

}

//to provide backward cimpatability
interface A {
	public void add();

	default void sub() {

	}

	static void mul() {

	}
}

class B implements A {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		A.super.sub();
	}

}

class C implements A {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

}

class D implements A {

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

}