package com.lecture102;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Program3 {
	public static void main(String[] args) {
		Path p1 = Paths.get("out", "Test.txt");
		Path p2 = Paths.get("out", "TestCopy.txt");
		try {
			Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Files copied using Nio");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
