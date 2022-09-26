package com.lecture92;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program1 {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grape");
		fruits.add("Banana"); 
		fruits.add("Apple");// allow duplicates
		System.out.println("Print fruitslist :"+fruits);
		System.out.println(" Contains method : "+fruits.contains("Apple"));
		Iterator<String> itr = fruits.iterator();
		System.out.println("iterating using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
