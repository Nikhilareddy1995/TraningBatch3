package com.day8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(122);
		list.add(128);
		list.add(126);
		list.add(22);
		list.add(25);

		System.out.println("before sorting" + list);
//consumer-FI
		list.stream().forEach(l -> {
			System.out.println(l);
		});

		list.stream().forEach(System.out::println);

	}

}
