package com.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExm {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(122);//*2
		list.add(128);//*2
		list.add(126);
		list.add(22);
		list.add(25);
		System.out.println(list);
		// intermediate and terminal operations
		//filter -- > predicate(FI)-->boolean
		//map --> Function(FI)--> result
		//internal iteration
		
		List<Integer> list2 = list.stream().filter(li -> li % 2==0 ).collect(Collectors.toList());
		List<Integer> list3 = list.stream().filter(li -> li % 2 == 0).map(l->l*l).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list3);
		
		
	}

}
