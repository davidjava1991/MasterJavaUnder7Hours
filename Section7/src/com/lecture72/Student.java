package com.lecture72;

import java.util.Objects;

public class Student implements Cloneable {
	int id;
	String name;
	String branch;
	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(branch, id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(branch, other.branch) && id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {	
		return super.clone();
	}
}
