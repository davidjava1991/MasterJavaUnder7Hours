package com.lecture64;

public sealed class Shape permits Circle,Rectangle {
	void draw() {
		System.out.println("Shape Drawn");
	}
}
