package com.day10;

//extends Thread
//
public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		Test t = new Test();// NEW
		t.start();// it will call run--> thread scheduler--> will allocate memory CPU
		// Runnable/Running

	}

}

//Thread, Runnable

//1 to 100 --> 5secons

//sequential vs parallel

//1 to 20-->thread1 --> 2secons-->10.30
//21 to 40-->2secons-->thread2-->10.30
//41 to 60-->2secons-->thread3-->10.30
//61 to 80-->2secons
//81 to 100-->2secons
