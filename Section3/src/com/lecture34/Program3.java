package com.lecture34;

public class Program3 {
	public static void main(String[] args) {
		int limit=10, i=0;
		do {
			i++;
			if(i == 4) {	
				continue;
			}
			if( i == 8) {
				break;
			}				
			System.out.println(" i = "+i);
		} while(i< limit);
	}
}
