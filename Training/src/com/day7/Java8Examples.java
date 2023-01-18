package com.day7;

public class Java8Examples {
	public static void main(String[] args) {
		// functional interfaces, LE, Method references, optional classes, stattic and
		// default methods
		// stream API,java date time improvemnets
		A a = (a1, n) -> {
			System.out.println(a1 + n);

		};

	}

}

@FunctionalInterface
interface A {
	public void add(int a, int b);

	// public void sub();
}