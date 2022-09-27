package com.lecture102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./out/Test.txt");
			BufferedReader br = new BufferedReader(fr);
			String out ="";
			while(true) {
				String s = br.readLine();
				if(s == null) {
					break;
				} else {
					out += s + "\n";
				}
			}
			br.close();
			System.out.println("File : \n"+out);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
