package com.lecture104;

public class Program1 {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		 System.out.println("id : "+m.getId());
		 System.out.println("name : "+m.getName());
		 System.out.println("priority : "+m.getPriority());
		 System.out.println("Current thread name : "+MyThread.currentThread().getName());
		 System.out.println("is Daemon : "+m.isDaemon());
	}
}
