package com.day2;

public class DataTypes {
	// single line comment

	/*
	 * multi line comment
	 */

	// 2 --> 0001
	// 3----> 0011
	// A --> 65 -->
	// a --> 97

	// compile

	// Numbers -> byte(8bits-1Byte),short(2Bytes),int(4
	// bytes),long(8bytes),double(8bytes),float(4bytes)
	// Characters
	// String
	// boolean

	// rules to define variable/identifier/method name
	// 1. first letter should starts with any character/ $ / _
	// 2. other letters allowed the any character/ any digit/ $/ _

	int number = 2;
	long b = -126;
	byte c = -126;
	double d = 1.8;
	char e = 'C';
	String name = "India554643";
	boolean value = true;

	// Method -- access specifier+ return type+method name+arguments/parameters

	public void add(int a, int b) {
		System.out.print(a + b+" ");
	}

	public int sub(int a, int b) {

		return a - b;
	}

	public static void main(String[] args) {
		DataTypes dataTypes = new DataTypes();
		dataTypes.add(1, 13);
		int result = dataTypes.sub(12, 10);
		System.out.print(result);

	}

}
