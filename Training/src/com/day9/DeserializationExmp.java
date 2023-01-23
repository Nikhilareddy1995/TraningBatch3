package com.day9;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExmp {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\nmunagal\\\\Desktop\\\\EmpDetails.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee readObject = (Employee) ois.readObject();
		System.out.println(readObject.getPassword());
		System.out.println(readObject.getName());
		System.out.println(readObject.getId());

	}

}
	