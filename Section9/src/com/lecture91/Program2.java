package com.lecture91;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		System.out.println("arr1 toString ="+Arrays.toString(arr1));
		int arr2[] = {4,2,3,1};
		Arrays.sort(arr2);
		System.out.println("Sorted arr2 : "+Arrays.toString(arr2));
		Arrays.fill(arr2, 0);
		System.out.println("arr2 filled with 0 : "+Arrays.toString(arr2));
		
	}
}
