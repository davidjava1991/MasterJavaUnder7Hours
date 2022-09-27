package com.lecture101;

public class PrinterClass {
	public PrinterClass(String msg) {
		System.out.println("Constructor message");
	}
	static void printStaticMessage(String msg) {
		System.out.println("Static Message ");
	}
	
	void printNonStaticMessage(String msg) {
		System.out.println("Non Static message");
	}
	
}
