package com.lecture71;

public class Program2 {
	public static void main(String[] args) {
		int a = 12;
		Integer b = a;
		System.out.println("Auto boxed value = "+b);
		Double x = Double.valueOf(12.34);
		double y = x;
		System.out.println("Auto Unboxed value = "+y);
		
	}
}
