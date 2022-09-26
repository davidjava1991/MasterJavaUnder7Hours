package com.lecture94;

public class Program1 {
	public static void main(String[] args) {
		GenericClass<Integer> integer = new GenericClass<>();
		integer.addItem(1);
		System.out.println("Integer : "+integer.getItem());
		GenericClass<String> string = new GenericClass<>();
		string.addItem("Apple");
		System.out.println("String : "+string.getItem());
	}
}
