package com.lecture61;

public class Program1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.draw();
		Shape square = new Shape() { // anonymous inner class
			@Override
			public void draw() {
					System.out.println("Square drawn");
			}
		};
		square.draw();
		
		
	}
}
