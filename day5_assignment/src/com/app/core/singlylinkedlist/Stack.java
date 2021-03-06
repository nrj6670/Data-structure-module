package com.app.core.singlylinkedlist;

public class Stack implements StackIntf {
	
	SinglyListNode head;

	public Stack() {
		head = null;
	}
	
	@Override
	public void push(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}

	@Override
	public int peek() {
		if(head == null) {
			return Integer.MIN_VALUE;
		}
		return head.data;
	}

	@Override
	public void pop() {
		if(head == null) {
			return;
		}
		
		head = head.next;
	}

	@Override
	public int getSize() {
		int size = 0;
		
		SinglyListNode currNode = head;
		
		while(currNode != null) {
			size++;
			currNode = currNode.next;
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

}
