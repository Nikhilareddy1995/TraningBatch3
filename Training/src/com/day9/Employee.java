package com.day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//marker interface-- which interface dont have any methods
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6761765810721441954L;
	int id;
	static String name;
	transient String password;//JVM default value-null
	String address;

	public Employee(int a, String b, String c, String address) {
		super();
		this.id = a;
		this.name = b;
		this.password = c;
		this.address=address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, Exception  {
		Employee employee = new Employee(12, "nikhila", "XXX","dis");
		Employee employee2 = new Employee(13, "radhika", "YYY","sndkns");

		FileOutputStream fos = new FileOutputStream("C:\\Users\\nmunagal\\Desktop\\EmpDetails.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
		System.out.println("Serialization is done");

	}

}
