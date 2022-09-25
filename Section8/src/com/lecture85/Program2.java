package com.lecture85;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height \n");
		int height = sc.nextInt();
		sc.close();
		assert height < 200 : "Too long ";
		assert height > 100 : "Too short ";
		
	}
}
