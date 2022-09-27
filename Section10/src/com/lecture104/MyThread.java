package com.lecture104;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread started");
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		Runnable r = ()-> System.out.println("started Thread");
		Thread t3 = new Thread(r);
		t3.start();
		
	}
}
