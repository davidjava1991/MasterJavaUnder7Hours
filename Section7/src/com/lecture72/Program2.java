package com.lecture72;

public class Program2 {
	public static void main(String[] args) {
		Student s1 = new Student(12, "David", "CS");
		try {
			Student s2 = (Student)s1.clone();
			System.out.println("s2 = "+s2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
