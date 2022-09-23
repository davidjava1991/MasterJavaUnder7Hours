package com.lecture65;

public class GetPizzaFactory {
	public PizzaFactory getPizzaFactory(String location) {
		if(location == null) {
			return null;
		}
		if(location.equals("Newyork")) {
			return new NewYorkPizzaFactory();
		} else if(location.equals("Florida")) {
			return new FloridaPizzaFactory();
		}	
		return null;
	}
}
