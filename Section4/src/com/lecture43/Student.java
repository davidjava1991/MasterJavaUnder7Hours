package com.lecture43;

public class Student {
	static String country = "India";
	int id;
	String name;
	String branch;
	public Student(int id,String name, String branch) {
		this.id =id;
		this.name = name;
		this.branch = branch;
	}
	
	public void printCountry() {
		System.out.println("Country = "+Student.country);
	}
	
	static void sayHello() {
		System.out.println("Hello");
		//this.id = 12; cannot access non static membbers
	}
	
	
	
}
