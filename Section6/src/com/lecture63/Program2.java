package com.lecture63;

public class Program2 {
	final void sayHello() { // cannot be overridden
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.sayHello();
	}
}

class Test extends Program2 {
	
}
