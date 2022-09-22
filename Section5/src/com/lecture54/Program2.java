package com.lecture54;

public class Program2 {
	int sum(int a, int b) {
		System.out.println("inside sum(int, int)");
		return a+b;	
	}
	
	int sum(int a, int b, int c) {
		System.out.println("inside sum(int, int, int)");
		return a+b+c;	
	}
	
	double sum(double a, double b) {
		System.out.println("inside sum(double, double)");
		return a+b;	
	}
	
	
	public static void main(String[] args) {
		Program2 p1 = new Program2();
		System.out.println("sum 1 = "+p1.sum(10,20));
		System.out.println("sum 2 = "+p1.sum(10,20, 30));
		System.out.println("sum 3 = "+p1.sum(10.22,20.54));
	}
	
}
