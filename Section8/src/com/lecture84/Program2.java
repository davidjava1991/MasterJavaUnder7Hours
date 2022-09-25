package com.lecture84;

import java.util.Optional;
import java.util.function.Consumer;

public class Program2 {
	public static void main(String[] args) {
		Optional<String> op1 = Optional.of("Hello World");
		op1.ifPresent(new Consumer<>(){
		@Override
			public void accept(String s) {
				System.out.println("length : "+s.length());
			}
		});
		Optional<String> op2 = Optional.ofNullable(null);
		System.out.println("orElse get : "+op2.orElseGet(() -> "default"));
	
	}
}
