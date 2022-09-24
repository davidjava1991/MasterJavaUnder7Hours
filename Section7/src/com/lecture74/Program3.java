package com.lecture74;

import java.util.regex.Pattern;

public class Program3 {
	public static void main(String[] args) {
		String email1 = "test@test.com";
		String email2 = "test.com";
		String regex = "^(.+)@(\\S+)$";
		System.out.println("email1 is "+Pattern.matches(regex, email1));
		System.out.println("email2 is "+Pattern.matches(regex, email2));

		
	}
}
