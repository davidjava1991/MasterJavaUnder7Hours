package com.lecture85;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of goals : ");
		int goals = sc.nextInt();
		sc.close();
		assert goals < 10; //  assert error	
	}

	
}
