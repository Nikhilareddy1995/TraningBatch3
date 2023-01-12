package com.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		ArrayList al = new ArrayList<>();
		al.add(1);
		al.add("hi");
		al.add('C');
		al.add(true);
		al.add(1.0);
		al.add(1L);
		al.add(1f);
		al.add(1698698);
		al.add(null);
		System.out.println(al);

		// System.out.println(al.size());
		// memory allocation, homoge int[] a=new int[8];
		// List -- 10,insertion order, duplicates and null, (cc*3/2)+1

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		//1.0V--> synchronized --> it participate in the multithreading --> performence is very low
		Vector v=new Vector<>();
		//10, (CC*2)
	}

}
