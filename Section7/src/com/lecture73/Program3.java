package com.lecture73;

import java.util.StringJoiner;

public class Program3 {
	public static void main(String[] args) {
		StringJoiner sj1 = new StringJoiner(":");
		sj1.add("Apple")
		.add("Orange")
		.add("Grapes");
		System.out.println("StringJoiner sj1 -> "+sj1.toString());
		
		StringJoiner sj2 = new StringJoiner("|", "[", "]");
		sj2.add("David")
		.add("Adam")
		.add("Sam");
		System.out.println("StringJoiner sj2 -> "+sj2.toString());

		
		
		
	}
}
