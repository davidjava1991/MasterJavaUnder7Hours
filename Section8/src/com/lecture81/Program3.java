package com.lecture81;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Something ");
			String str = sc.nextLine();
			System.out.println(" You entered : "+str);
		} finally {
			System.out.println("Finally always execute");
		}
	}
}
