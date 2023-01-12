package com.day4;

public class ChildAndParentObjectCreation extends A {
	int a=10;

	@Override
	public void hi() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		ChildAndParentObjectCreation collectionsExample = new ChildAndParentObjectCreation();// ce
		//CollectionsExample c=new A();
		A a = new ChildAndParentObjectCreation();// ce
		A a1 = new A();// a		
		collectionsExample.hi();
		a.hi();
		a1.hi();
		System.out.println(collectionsExample.a);
		System.out.println(a.a);
		System.out.println(a1.a);
	}

}

class A {
	int a = 20;

	public void hi() {
		System.out.println("hi");
	}
}
