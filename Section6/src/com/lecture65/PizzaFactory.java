package com.lecture65;

public abstract class PizzaFactory {
	protected double price;
	
	abstract void setPrice();
	
	public double getBill(int quantity) {
		return (quantity * price);
	}
}
