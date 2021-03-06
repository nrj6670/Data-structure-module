package com.app.core.sortedlinkedlist;

public class SortedLinkedList implements SortedLinkedListIntf {
	DoublyListNode head;
	
	public SortedLinkedList() {
		head = null;
	}
	
	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		if(head.data > element) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			return;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode.next != null && currNode.next.data < element) {
			currNode = currNode.next;
		}
		
		newNode.next = currNode.next;
		newNode.prev = currNode;
		currNode.next = newNode;
	}

	@Override
	public void Delete(int element) {
		if(head == null) {
			return;
		}
		
		if(head.data == element) {
			head.next.prev = null;
			head = head.next;
			return;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode != null) {
			if(currNode.data == element) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				break;
			}
			currNode = currNode.next;
		}
	}

	@Override
	public int[] GetAllElements() {
		int [] result = new int[getListSize()];
		
		DoublyListNode currNode = head;
		int index = 0;
		
		while(currNode != null) {
			result[index++] = currNode.data;
			currNode = currNode.next;
		}
		
		return result;
	}
	
	public int getListSize() {
		if(head == null) {
			return 0;
		}
		
		DoublyListNode currNode = head;
		int size = 0;
		
		while(currNode != null) {
			size++;
			currNode = currNode.next;
		}
		
		return size;
	}

}
