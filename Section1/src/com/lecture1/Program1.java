package com.lecture1;

import java.util.Scanner;

public class Program1 {
	public static boolean evenOrOdd(int num) {
		return (num%2==0)? true:false;
	}
	
	public static void main(String[] args) {
		System.out.println("enter number \n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(evenOrOdd(n)) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}
}
