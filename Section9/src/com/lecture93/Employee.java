package com.lecture93;

public class Employee {
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee[name= "+this.name+", age= "+age+"]";
	}
	
}	
