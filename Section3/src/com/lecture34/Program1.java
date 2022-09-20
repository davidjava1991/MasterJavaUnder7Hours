package com.lecture34;

public class Program1 {
	public static void main(String[] args) {
		int limit = 10;
		for(int i=0; i<limit; i++) {
			System.out.println(" i = "+i);
		}
		
		System.out.println("======Enhanced for loop======");
		String[] names= {"David","Adam","John","Sam"};
		for(String name: names) {
			System.out.println("Hello "+name);
		}
		
		
	}
}
