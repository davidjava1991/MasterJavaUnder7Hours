package com.lecture91;

public class Program1 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		String[]arr2 = {"David","Adam","Sam","Fred"};
		System.out.println("arr1 details");
		for( int a : arr1) {
			System.out.println(a);
		}
		System.out.println("arr2 length :"+arr2.length);
	}
}
