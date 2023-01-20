package com.day8;

public class ReturnVsSysout {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public String sub(int a, int b) {
		return "sub of two elements "+(a - b);
	}

	public static void main(String[] args) {
		ReturnVsSysout r=new ReturnVsSysout();
		r.add(1, 3);
		String result=r.sub(12, 7);
		System.out.println(result);
	}

}
