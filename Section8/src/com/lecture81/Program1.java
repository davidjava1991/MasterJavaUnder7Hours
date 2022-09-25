package com.lecture81;

public class Program1 {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int c = a/b;
		} catch(ArithmeticException e)  {
			System.err.println(" Error handled");
			e.printStackTrace();
		}
	}
}
