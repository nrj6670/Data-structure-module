package com.app.core.queue;


public class CircularQueueTester {
	public void pushIntoQueue() {
		QueueImplementation queue = new QueueImplementation(3);
		queue.AddQ(1);
		queue.AddQ(2);
		queue.AddQ(3);
		System.out.println("stack size : " + queue.getQueueSize());
	}
	
	public void isQueueEmpty() {
		//QueueImplementation queue = new QueueImplementation(1);
		QueueImplementation queue = new QueueImplementation(2);
		queue.AddQ(15);
		System.out.println("Is queue empty : " + queue.IsEmpty());
		queue.DeleteQ();
		System.out.println("Is queue empty : " + queue.IsEmpty());
	}
	
	public void isQueueFull() {
		QueueImplementation queue = new QueueImplementation(2);
		queue.AddQ(15);
		queue.AddQ(20);
		queue.AddQ(30);
		System.out.println("Is queue empty : " + queue.IsEmpty());
		System.out.println("Is queue full : " + queue.IsFull());
		System.out.println(queue.DeleteQ());
		queue.AddQ(30);
		System.out.println("Queue size : " + queue.getQueueSize());
	}
	
	public void popFromQueue() {
		QueueImplementation queue = new QueueImplementation(3);
		queue.AddQ(1);
		queue.AddQ(2);
		queue.AddQ(3);
		while(!queue.IsEmpty()) {
			System.out.println("poped out element : " + queue.DeleteQ());
		}
	}
}
