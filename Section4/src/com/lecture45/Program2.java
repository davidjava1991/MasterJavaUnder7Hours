package com.lecture45;

import java.util.ArrayList;

public class Program2 {
	public static void main(String[] args) {
		Car c1 = new Car("Ford","Red",10);
		Car c2 = new Car("Skoda","Blue",18);
		Car c3 = new Car("Fiat","White",13);
		ArrayList<Car> carList= new ArrayList<>();
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		CarShowroom c = new CarShowroom(carList);
		c.printCarDetails();
	}


}
