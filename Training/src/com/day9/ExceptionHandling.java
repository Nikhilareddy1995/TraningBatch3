package com.day9;

public class ExceptionHandling {
	public static int div(int a, int b) throws DivByZero {
		try {
			return a / b;
		} catch (Exception e) {
			throw new DivByZero("we cant pass zero value");
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println(div(10, 0));
		// line by line

		try {
			System.out.println("hello");
			int a = 10 / 0;
			System.out.println(a);
			System.out.println("hi");
		} catch (Exception e) {
			System.out.println("some exception occured");
		} finally {
			System.out.println("ujhgih");
		}

	}

}
