package com.day7;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(123);
		//list.add("uuh");
		//list.add("hsid");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Integer nikhila : list) {
			System.out.println(nikhila);
		}
	}

}
