package com.lecture53;

public class Program1 {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(31, "White");
		System.out.println("======v1 details ======");
		System.out.println(v1.colour);
		System.out.println(v1.number);
		v1.start();
		v1.applyBreak();
		Car c1 = new Car(22, "Green", "Fiat");
		System.out.println(" ====== Car Details ======");
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c1.colour);
		c1.start();
		c1.applyBreak();
	}
}
