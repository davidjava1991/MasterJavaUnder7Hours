package com.lecture82;

public class Program2 {
	public static int divide(int a, int  b) throws ArithmeticException{
		return (a/b);		
		
	}
	
	public static void main(String[] args) {
		System.out.println(divide(10, 2));
		System.out.println(divide(10, 0));

	}
}
