package com.lecture32;

public class Program3 {
	public static void main(String[] args) {
		boolean a = true, b = false;
		if(a&&b) {
			System.out.println(" both are true");
		} else if(a || b) {
			System.out.println("either one is true");
		}
		if(a&b) {
			System.out.println(" both are true");
		} else if(a | b) {
			System.out.println("either one is true");
		}
		
	}
}
