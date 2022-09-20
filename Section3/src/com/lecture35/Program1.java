package com.lecture35;

public class Program1 {
	public static void main(String[] args) {
		String day = "mon";
		switch(day) {
		case "sun" : System.out.println("holiday");
		break;
		case "mon" : System.out.println("go to work");
		break;
		case "sat" : System.out.println("it is weekend");
		break;
		default: System.out.println(" normal day");
		}
		
		
	}
}
