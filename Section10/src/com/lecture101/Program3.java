package com.lecture101;

import java.util.ArrayList;

public class Program3 {
	public static void main(String[] args) {
		ArrayList<Student> studList  = new ArrayList<>();
		studList.add(new Student(12, "David", "CS"));
		studList.add(new Student(22, "Sam", "AC"));
		studList.add(new Student(2, "Adam", "AC"));
		studList.add(new Student(13, "Paul", "CS"));
		studList.add(new Student(25, "Jose", "IT"));
		studList.stream() 
		.filter(s-> s.id >13)
		.map(s-> "id = "+s.id)
		.forEach(System.out::println);
		
	}
}
