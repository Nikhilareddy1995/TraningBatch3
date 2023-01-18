package com.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(869);
		list.add(25);
		list.add(12);
		list.add(869);
		list.add(25);
		
		TreeSet<Integer> treeSet=new TreeSet<>(list);
		System.out.println(treeSet);
		// System.out.println(list);

		for (Integer num : list) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}
//arraylist, vector
//hashset, treeset
//hashmap
