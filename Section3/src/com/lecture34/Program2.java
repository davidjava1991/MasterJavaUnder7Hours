package com.lecture34;

public class Program2 {
	public static void main(String[] args) {
		String s = "Hello World", rev ="";
		int pos = s.length() - 1;
		while(pos >= 0) {
			rev += s.charAt(pos);
			pos--;
		}
		System.out.println("reverse string = "+rev);
	}
}
