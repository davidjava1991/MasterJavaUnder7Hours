package com.lecture52;

public class Program2 {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println("======c1 details======");
		System.out.println(c1);
		Customer c2 = new Customer(12,"David","India");
		System.out.println("======c2 details======");
		System.out.println(c2);
	}
}
