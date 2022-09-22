package com.lecture54;

public class Employee extends Person {
	int id;
	String department;
	
	public Employee(String name, int height, int weight, int id, String department) {
		super(name, height, weight);
		this.id = id;
		this.department = department;
	}

	@Override
	public void run() {
		System.out.println("Employee running");
	}
	
}
