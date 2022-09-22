package com.lecture54;

public class Program1 {
	public static void main(String[] args) {
		Employee e1 = new Employee("David", 6, 60, 12, "Engineering");
		System.out.println(" overridden run method");
		e1.run();
	}
}
