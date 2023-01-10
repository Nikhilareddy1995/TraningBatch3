package com.day2;

public class Sample {
	static String str;
	public void Sample() {
		System.out.println("inside con");
		str="Hello World";
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		try {
			Float f1=new Float("3.0");
			int x=f1.intValue();
			byte b=f1.byteValue();
			double d=f1.doubleValue();
			System.out.println(x+b+d);
		}catch(NumberFormatException e) {
			System.out.println("ba");
		}
		
	}
}
