package com.lecture53;

public class Car extends Vehicle {
	String name;
	
	public Car(int number, String colour, String name) {
		super(number, colour);
		this.name = name;
	}

	public void start() {
		super.start();// super to call parent class method
		System.out.println("Car started");
	}
	
	void printMessage() {
		System.out.println("Message from "+this.name);
	}

}
