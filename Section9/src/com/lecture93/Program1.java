package com.lecture93;

import java.util.ArrayList;
import java.util.Collections;

public class Program1 {
	public static void main(String[] args) {
		ArrayList<String> sports = new ArrayList<>();
		sports.add("Football");
		sports.add("Basket ball");
		sports.add("Hockey");
		sports.add("Tennis");
		Collections.shuffle(sports);
		System.out.println("Shuffled list : "+sports);
		Collections.sort(sports);
		System.out.println("sorted list : "+sports);
	}
}
