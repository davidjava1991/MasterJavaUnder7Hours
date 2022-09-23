package com.lecture65;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		GetPizzaFactory fact = new GetPizzaFactory();
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		System.out.println(" Enter Number of Pizza : \n");
		quantity = sc.nextInt();
		sc.close();
		System.out.println("======= Bill from Newyork ======");
		PizzaFactory fact1 = fact.getPizzaFactory("Newyork");
		fact1.setPrice();
		System.out.println("Bill : "+fact1.getBill(quantity));
		System.out.println("======= Bill from Florida ======");
		PizzaFactory fact2 = fact.getPizzaFactory("Florida");
		fact2.setPrice();
		System.out.println("Bill : "+fact2.getBill(quantity));
	}
}
