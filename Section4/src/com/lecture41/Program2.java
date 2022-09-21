package com.lecture41;

public class Program2 {
	public static void main(String[] args) {
		Duck d1 = new Duck();
		d1.name = "Donald";
		d1.colour = "White";
		System.out.println("-----duck details-----");
		System.out.println(d1.name);
		System.out.println(d1.colour);
		d1.fly();
		System.out.println(d1.makeNoise());
	}
}
