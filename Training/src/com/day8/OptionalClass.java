package com.day8;

import java.util.Optional;
//to overcome the NPE
public class OptionalClass {
	public static void main(String[] args) {
		String[] names = new String[2]; // 
		names[0]="hfugdiuf";
		//System.out.println(names[0].toLowerCase());
		
		
		Optional<String> name = Optional.ofNullable(names[0]);
		if(name.isPresent()) {
			System.out.println(names[0].toLowerCase());
		}
	}
}
