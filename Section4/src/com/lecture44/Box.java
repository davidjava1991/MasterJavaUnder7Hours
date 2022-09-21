package com.lecture44;

public class Box {
	{
		System.out.println("IIB 1 called");
	}
	
	static {
		System.out.println("SIB 1 Called");
	}
	
	public Box() {
		System.out.println("Constructor called");
	}
	
	{
		System.out.println("IIB 2 called");
	}
	
	static {
		System.out.println("SIB 2 called");
	}

}
