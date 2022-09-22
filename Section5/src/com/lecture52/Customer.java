package com.lecture52;

public record Customer( int id, String name, String location) {
	public Customer() {
		this(0, "Name", "Not defined");
		System.out.println(" No arg Constructor");
	}
	
	public Customer(int id, String name, String location) {
		this.id = id;
		this.location = location;
		this.name = name;
		System.out.println("Canonical Constructor");
	}
}
