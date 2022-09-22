package com.lecture51;

public class Program2 {
	public static void main(String[] args) {
		Student s1 = new Student(12, "David", "CS");
		System.out.println("======Student Details ======");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getBranch());
	}
}
