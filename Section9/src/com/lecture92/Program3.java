package com.lecture92;

import java.util.PriorityQueue;

public class Program3 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("David");
		queue.offer("Paul");
		queue.add("Adam");
		queue.add("John");
		System.out.println("Printing queue : "+queue);
		System.out.println("Peek queue "+queue.peek());
		System.out.println("Poll queue "+queue.poll());
		System.out.println("queue after poll "+queue);
	}
}
