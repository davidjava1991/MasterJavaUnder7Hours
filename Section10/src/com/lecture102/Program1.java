package com.lecture102;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("./out/Test.txt");
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("Hello World \n i am a Text File");
			bw.close();
			System.out.println("File generated");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
