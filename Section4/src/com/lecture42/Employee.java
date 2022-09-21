package com.lecture42;

public class Employee {
	int id;
	String name;
	int salary;
	public Employee() {
		System.out.println("from default constructor");
	}
	
	public Employee(int eid) {
		System.out.println("inside parameterized constructor 1");
		id = eid;
	}
	
	public Employee(int eid, String ename, int esalary) {
		System.out.println("inside parameterized constructor 2");
		id = eid;
		name = ename;
		salary = esalary;
		
	}
	
	
}
