package com.day4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet<>();

		set.add(123);
		set.add("Ghih");
		set.add('C');
		set.add(null);
		set.add(123);
		set.add(6986);
		System.out.println(set);
		/*
		 * //Iterator Iterator iterator = set.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		//sorting purpose--ascending order 
		Set s=new TreeSet<>();
		s.add(123);
		s.add(376487);
		s.add(87);
		s.add(123);
		s.add(123);
		s.add(8);
		System.out.println(s);
		
		Set s1=new TreeSet<>();
		//ascii values
		s1.add("hi");
		s1.add("hi");
		s1.add("ABC");
		s1.add("aef");
		s1.add("abf");
		s1.add("hgfiudsgjkf");
		s1.add("bxhcg");
		System.out.println(s1); 
		System.out.println("hi");

	}

}

//List --> ArrayList-10, insertion order, hetereo and Vector- legacy(1.0v), performance is low
//Set -- Hashset- wont allow the duplicates and insertion order and Treeset-- sorting-ascending order
