package com.lecture51;

public class Program1 {
	public static void main(String[] args) {
		A a1 = new A();
		//a1.var1; private field not visible
		System.out.println("var2 = "+a1.var2);
		System.out.println("var3 = "+a1.var3);
		System.out.println("var4 = "+a1.var4);
	}
}
