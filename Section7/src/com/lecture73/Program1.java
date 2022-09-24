package com.lecture73;

public class Program1 {
	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println("indexOf -> "+s1.indexOf("World"));
		System.out.println(" charAt -> "+s1.charAt(2));
		String[] arr = s1.split(" ");
		System.out.println("split -> ");
		for( String s:arr) {
			System.out.println(s);
		}
		System.out.println("substring -> "+s1.substring(5));
		System.out.println("toUpperCase -> "+s1.toUpperCase());		
	}
}
