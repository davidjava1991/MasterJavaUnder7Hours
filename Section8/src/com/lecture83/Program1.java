package com.lecture83;

public class Program1 {
	public static void main(String[] args) {
		try {
			throw new MyCheckedException("MyCheckedException message ");
		} catch(MyCheckedException e) {
			e.printStackTrace();
		}
	}
}
