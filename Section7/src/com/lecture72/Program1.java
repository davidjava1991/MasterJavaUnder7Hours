package com.lecture72;

public class Program1 {
	public static void main(String[] args) {
		Student s1 = new Student(12, "David", "CS");
		System.out.println("hashCode = "+s1.hashCode());
		System.out.println("toString = "+s1.toString());
		Student s2 = new Student(21, "Paul", "CS");
		System.out.println("equals method = "+(s1.equals(s2)));
	}
}
