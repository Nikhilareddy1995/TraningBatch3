package com.day7;

public class MultipleInheritence implements Interface1, Interface2 {

	public static void main(String[] args) {
		MultipleInheritence mul = new MultipleInheritence();
		mul.add();
	}

	@Override
	public void add() {
		System.out.println("hkj");

	}

}

class Cls1 {
	public void add() {
		System.out.println("Hi");
	}
}

class Cls2 {
	public void add() {
		System.out.println("NIkhila");
	}
}

interface Interface1 {
	public void add();
}

interface Interface2 {
	public void add();
}
