package com.day7;

public class Java8Examples {
	public static void main(String[] args) {
		// functional interfaces, LE, Method references, optional classes, stattic and
		// default methods in interfaces
		// stream API,java date time improvemnets
		A a = (a1, n) -> {
		};

		A a1 = new A() {

			@Override
			public void add(int a, int b) {

			}
		};

	}

}

@FunctionalInterface
interface A {
	public void add(int a, int b);

	// public void sub();
}