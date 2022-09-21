package com.lecture42;

public class Program1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(12);
		System.out.println("======e2 Details=======");
		System.out.println(" e2.id = "+e2.id);
		Employee e3 = new Employee(32,"David",1200);
		System.out.println("======e3 Details=======");
		System.out.println("name = "+e3.name);
		System.out.println("id = "+e3.id);
		System.out.println("salary = "+e3.salary);
	}
}
