package com.lecture55;

public class Program2 {
	public static void main(String[] args) {
		Vehicle v1 = new Truck();
		v1.start();// dynamic method dispatch
		v1.applyBreak();
		//v1.unload(); not available
		if(v1 instanceof Truck) {
			Truck v2 = (Truck)v1;// casting
			v2.unload();
		}
		System.out.println("==========================");
		Vehicle v = new Truck();
		if(v instanceof Truck t) { //pattern matching
			t.start();
			t.unload();
		}
	
	}
}
