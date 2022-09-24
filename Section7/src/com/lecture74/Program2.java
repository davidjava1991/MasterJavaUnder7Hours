package com.lecture74;

import java.util.regex.Pattern;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("pattern1 [abc]: "+Pattern.matches("[abc]", "a"));
		System.out.println("pattern 2 [^abc]: "+Pattern.matches("[^abc]", "d"));
		System.out.println("pattern 3 [a-zA-Z]: "+Pattern.matches("[a-zA-Z]", "a"));
		System.out.println("pattern 4 [a-z&&[def]]: "+Pattern.matches("[a-z&&[def]]", "d"));
		System.out.println("pattern 5 [amn]? : "+Pattern.matches("[amn]?", "a"));
		System.out.println("pattern 6 [amn]+ : "+Pattern.matches("[amn]+", "a"));
	}
}
