package com.day3;

public class Overloading {
	//Overloading, overriding-polymorphism,Inheritence,abstraction,encapsulation,assosiation

	public void add() {
		System.out.println("first");
	}
	public void add(int a) {
		System.out.println("first-second");
	}
	public void add(String a) {
		System.out.println("first-second-third");
	}
	public void add(int a,int b) {
		System.out.println("first-seco-thr-fo");
	}
	public static void main(String[] args) {
		Overloading oopsExamples=new Overloading();
		oopsExamples.add(1,3);
	}
}
//int -0
//float-0.0
//string -null
