package com.lecture75;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class Program1 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("print date :"+d1);
		System.out.println("getTime method"+d1.getTime());
		System.out.println("Date before : "+d1.before(new Date(0)));
		System.out.println("Date after : "+d1.after(new Date(0)));

		Instant i1 = Instant.now();
		System.out.println("printing instant : "+i1);
		

		Duration dur = Duration.ofSeconds(100);
		System.out.println("printing Duration : "+dur);
	}

}
