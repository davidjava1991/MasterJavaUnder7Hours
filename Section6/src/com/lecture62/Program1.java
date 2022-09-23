package com.lecture62;

public class Program1 {
	public static void main(String[] args) {
		Print p1 = new Print();
		p1.print("Hello Interface");
		new Printable() { // Anonymous object
			@Override
			public void print(String s) {
				System.out.println("Anonymous message : "+s);	
			}
		}.print("Hello");
		
		
	}
}
