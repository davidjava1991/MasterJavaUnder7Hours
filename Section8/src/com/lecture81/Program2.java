package com.lecture81;

public class Program2 {
	public static void main(String[] args) {
		try {
			String str = "1.23";
			int val = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			System.out.println("Error handled");
		} finally {
			System.out.println("Finally always execute");
		}
		
	}
}
