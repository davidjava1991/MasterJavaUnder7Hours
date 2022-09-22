package com.lecture53;

public class Vehicle {
	int number;
	String colour;
	
	
	public Vehicle(int number, String colour) {
		super();
		this.number = number;
		this.colour = colour;
	}

	public void start() {
		System.out.println("vehicle started");
	}
	
	protected void applyBreak() {
		System.out.println("Vehicle breaked");
	}
}
