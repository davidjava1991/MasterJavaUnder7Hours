package com.lecture92;

import java.util.HashMap;

public class Program4 {
	public static void main(String[] args) {
		HashMap<String, Double> priceMap = new HashMap<>();
		priceMap.put("milk", 1.33);
		priceMap.put("water", 2.99);
		priceMap.put("book", 3.23);
		priceMap.put("egg", 1.30);
		System.out.println("Price of water -> "+priceMap.get("water"));
		System.out.println("All Keys : "+priceMap.keySet());
		System.out.println("All Values : "+priceMap.values());	
	}
}
