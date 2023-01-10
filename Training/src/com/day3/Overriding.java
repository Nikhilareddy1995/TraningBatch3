package com.day3;

import com.day2.ClassA;

//Inheritence-- reusability- extends keyword
public class Overriding extends ClassA {
	@Override
	public void add(int a, int b) {
		System.out.println("addition of two numbers is " + (a + b));
	}

	public static void main(String[] args) {
		Overriding overriding = new Overriding();
		overriding.add(12, 23);
	}

}
