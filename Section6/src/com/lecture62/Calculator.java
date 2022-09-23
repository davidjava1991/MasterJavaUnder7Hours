package com.lecture62;

public interface Calculator {
	default void details() {
		System.out.println(" Java Calculator");
		operationns();
	}

	private void operationns() {
		System.out.println("Add");
		System.out.println("Multiply");
	}
	abstract int sum(int a, int b);
	abstract int multiply(int a, int b);
}	


