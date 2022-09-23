package com.lecture62;

public class Program2 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator() {
			
			@Override
			public int sum(int a, int b) {
				return (a+b);
			}
			
			@Override
			public int multiply(int a, int b) {
				return (a * b);
			}
		};
		c1.details();
		System.out.println("Sum = "+c1.sum(10, 20));
		System.out.println("Multiply = "+c1.multiply(10,20));
	}
	
}
