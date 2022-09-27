package com.lecture101;

public class Program2 {
	public static void main(String[] args) {
		Printer p1 = PrinterClass::printStaticMessage;
		p1.print("Static Method reference");
		Printer p2 = new PrinterClass("Hello")::printNonStaticMessage;
		p2.print("Non Static Method reference");
		Printer p3 = PrinterClass::new;// Constructor method reference
	}
}
