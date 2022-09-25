package com.lecture82;

public class Program1 {
	public static void main(String[] args) {
		int num = 12, deno = 0;
		if(deno == 0) {
			throw new ArithmeticException(" Denomenator is zero");
		} else {
			System.out.println("Divison -> "+(num/deno));
		}
	}
}
