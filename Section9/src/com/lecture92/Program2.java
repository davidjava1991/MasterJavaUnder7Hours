package com.lecture92;

import java.util.HashSet;
import java.util.Set;

public class Program2 {
	public static void main(String[] args) {
		Set<Integer> set1 = Set.of(1,2,3,4,5);
		System.out.println("printing set1 : "+set1);
		//set1.remove(1); un-modifiable set
		HashSet<String> set2 = new HashSet<>();
		set2.add("Phone");
		set2.add("Tablet");
		set2.add("Television");
		set2.add("Phone");// Duplicate element
		System.out.println("printing set2 : "+set2);

	}
}
