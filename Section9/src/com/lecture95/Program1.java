package com.lecture95;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("./out/Customer.txt");
			ObjectOutputStream os =new ObjectOutputStream(fos);
			os.writeObject(new Customer(1,"David","Test address"));
			os.close();
			System.out.println("Customer serialized");
			} catch(IOException e) {
			}
		try {
			FileInputStream fis = new FileInputStream("./out/Customer.txt");
			ObjectInputStream
			ois = new ObjectInputStream(fis);
			Customer c = (Customer)ois.readObject();
			ois.close();
			System.out.println("Customer details "+c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
