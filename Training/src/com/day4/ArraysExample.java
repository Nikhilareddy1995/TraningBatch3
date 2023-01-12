package com.day4;

//default import statement
//import java.lang.String;
public class ArraysExample {
	public static void main(String[] args) {

		int[] numbers = new int[500000];// allocating memory
		
		numbers[0]=90;
		numbers[1]=80;
		numbers[3]=909;
		numbers[6]=790;//exception
		

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
//int -0
//float-0.0
//string -null
