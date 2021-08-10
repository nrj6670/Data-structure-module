package com.app.core.circularlinkedlist;

public class DoublyListNode {
	public int data;
	public DoublyListNode next;
	public DoublyListNode prev;

	public DoublyListNode(int element) {
		data = element;
		next = null;
		prev = null;
	}
}
