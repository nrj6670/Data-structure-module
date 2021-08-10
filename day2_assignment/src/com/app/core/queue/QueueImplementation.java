package com.app.core.queue;

public class QueueImplementation implements QueueIntf {
	private int [] arr;
	private int capacity;
	private int rearIndex;
	private int frontIndex;
	private int size;
	
	public QueueImplementation(int capacity) {
		this.arr = new int[capacity];
		this.capacity = capacity;
		this.rearIndex = 0;
		this.frontIndex = -1;
		this.size = 0;
	}

	@Override
	public void AddQ(int elem) {
		if(frontIndex == rearIndex) {
			System.out.println("Queue is full");
			return;
		}
		arr[rearIndex] = elem;
		if(frontIndex == -1) {
			frontIndex = 0;
		}
		rearIndex = (rearIndex + 1) % capacity;
		size++;
	}

	@Override
	public int DeleteQ() {
		if(IsEmpty()) {
			return Integer.MAX_VALUE;
		}
		int res = arr[frontIndex];
		frontIndex = (frontIndex + 1) % capacity;
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
	
	@Override
	public int getQueueSize() {
		int size = 0;
		
		if(frontIndex == rearIndex) {
			size = (IsEmpty()) ? 0 : capacity;
		} else if (frontIndex < rearIndex) {
			size = rearIndex - frontIndex;
		} else {
			size = capacity - frontIndex + rearIndex + 1;
		}
		
		return size;
	}

}
