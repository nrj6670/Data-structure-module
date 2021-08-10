package com.app.core.stack;

public class StackImplementation implements StackIntf {
	private int [] arr;
	private int size;
	private int capacity;
	
	public StackImplementation(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		arr = new int[capacity];
	}

	@Override
	public void Push(int elem) {
		if(size == capacity) {
			System.out.println("Your stack is full");
			return;
		}
		
		arr[size] = elem;
		size++;
	}

	@Override
	public int Pop() {
		if(size == 0) {
			System.out.println("Your stack is empty");
			return Integer.MIN_VALUE;
		}
		int res = arr[size - 1];
		size--;
		return res;
	}

	@Override
	public boolean IsEmpty() {
		return this.size == 0;
	}

	@Override
	public boolean IsFull() {
		return this.size == this.capacity;
	}

}
