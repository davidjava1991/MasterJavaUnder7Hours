package com.lecture41;

public class Program1 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "Atomic Habbits";
		b1.author = "James clear";
		b1.pages = 300;
		System.out.println("======Book Details======");
		System.out.println(b1.name);
		System.out.println(b1.author);
		System.out.println(b1.pages);
	}
}
