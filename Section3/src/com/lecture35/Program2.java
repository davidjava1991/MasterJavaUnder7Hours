package com.lecture35;

public class Program2 {
	public static String getTemprature(Month m) {
		String r = switch (m) {
		case JAN, DEC ->  {yield "0 c";}
		case FEB,MAR,APR -> {yield "30 c";}
		case JUN,JUL -> {yield "35 c";}
		default -> {yield "25 c";}
		};
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println("Temparature of January = "
				+getTemprature(Month.JAN));
		System.out.println("Temparature of June = "
				+getTemprature(Month.JUN));
	}
}
