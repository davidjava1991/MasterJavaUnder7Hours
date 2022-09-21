package com.lecture43;

public class Program1 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "David", "CS");
		s1.printCountry();
		s1.sayHello();// warning 
		Student.sayHello();
	}
}
