package com.app.core.queue;

public class QueueImplementation implements QueueIntf {
	private int [] arr;
	private int size;
	private int capacity;
	private int nextIndex;
	private int startIndex;
	
	public QueueImplementation(int capacity) {
		this.arr = new int[capacity];
		this.size = 0;
		this.capacity = capacity;
		this.nextIndex = 0;
		this.startIndex = 0;
	}

	@Override
	public void AddQ(int elem) {
		if(size == capacity) {
			System.out.println("Your queue is full");
			return;
		}
		
		arr[nextIndex] = elem;
		nextIndex = (nextIndex + 1) % capacity;
		size++;
	}

	@Override
	public int DeleteQ() {
		if(IsEmpty()) {
			return Integer.MAX_VALUE;
		}
		
		int res = arr[startIndex];
		startIndex = (startIndex+1) % capacity;
		size--;
		return res;
	}

	@Override
	public boolean IsEmpty() {
		return size == 0;
	}

	@Override
	public boolean IsFull() {
		return size == capacity;
	}

}
