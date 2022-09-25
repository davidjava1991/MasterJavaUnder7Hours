package com.lecture83;

public class Program2 {
	
	 void testException(int age) throws MyUnCheckedException {
		if(age > 120) {
			throw new MyUnCheckedException("age is larger than 120");
		} else {
			System.out.println("Age = "+age);
		}				
	}
	 
	public static void main(String[] args) {
		new Program2().testException(30);
		new Program2().testException(121);
	}

}
