package com.lecture73;

public class Program2 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("Welcome ").append("to ")
		.append("Java");
		System.out.println("StringBuffer sb1 = "+sb1.toString());
		System.out.println("Reversed sb1 = "+sb1.reverse());
		
		StringBuilder sb2 = new StringBuilder("My ");
		sb2.append(" name is David");
		System.out.println("StringBuilder sb2 = "+sb2.toString());
		System.out.println("insert -> "+sb2.insert(12, "Mr "));
		
	}
}
