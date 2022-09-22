package com.lecture54;

public class Person {
	String name;
	int height;
	int weight;
	
	public Person( String name, int height, int weight) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	public void run() {
		System.out.println("Person running");
	}
	
}
