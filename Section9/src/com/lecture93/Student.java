package com.lecture93;

public class Student implements Comparable<Student>{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		if(s.id < this.id) {
			return 1;
		} else if(s.id>this.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
