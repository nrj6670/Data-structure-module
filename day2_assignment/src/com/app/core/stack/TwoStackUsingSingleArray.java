package com.app.core.stack;

public class TwoStackUsingSingleArray {
	private int [] arr;
	private int capacity;
	
	private int top1;
	private int top2;
	
	public TwoStackUsingSingleArray(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.top1 = -1;
		this.top2 = capacity;
	}
	
	public void pushInStackOne(int data) {
		if(top1 + 1 == top2) {
			System.out.println("Stack one is full");
			return;
		}
		
		arr[++top1] = data;
	}
	
	public void pushInStackTwo(int data) {
		if(top2 - 1 == top1) {
			System.out.println("Stack two is full");
			return;
		}
		
		arr[--top2] = data;
	}
	
	public int popFromStackOne() {
		if(top1 == -1) {
			System.out.println("Stack one is empty");
			return Integer.MIN_VALUE;
		}
		
		int res = arr[top1--];
		return res;
	}
	
	public int popFromStacktwo() {
		if(top2 == capacity) {
			System.out.println("Stack one is empty");
			return Integer.MAX_VALUE;
		}
		
		int res = arr[top2++];
		return res;
	}
	
	public boolean isStackOneEmpty() {
		return top1 == -1;
	}
	
	public boolean isStackTwoEmpty() {
		return top2 == capacity;
	}
	
	public int getStackOneSize() {
		return top1 + 1;
	}
	
	public int getStackTwoSize() {
		return capacity - top2;
	}
}
