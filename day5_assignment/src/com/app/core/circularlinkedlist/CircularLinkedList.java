package com.app.core.circularlinkedlist;

import java.util.Arrays;

public class CircularLinkedList implements SortedLinkedListIntf {

	DoublyListNode head;
	
	public CircularLinkedList() {
		head = null;
	}
	
	@Override
	public void Insert(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		
		if(head == null) {
			head = newNode;
			newNode.next = newNode.prev = head;
			return;
		}
		
		if(head.data > element) {
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode.next != head && currNode.next.data < element) {
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
		
		if(head.next == head && head.data == element) {
			head = null;
			return;
		}
		
		DoublyListNode currNode = head;
		
		boolean reachedHead = false;
		
		while(true) {
			if(currNode.data == element) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				if(currNode == head) {
					head = currNode.next;
				}
				break;
			}
			
			currNode = currNode.next;
			
			if(currNode == head) {
				break;
			}
		}
	}

	@Override
	public int[] GetAllElements() {
		//this method is going to print all the list items until it reaches
				//the head again
				int [] list = new int[getListSize()];
				
				if(head == null) {
					return list;
				}
				
				DoublyListNode currNode = head;
				int index = 0;
				boolean reachedHead = false;
				
				while(!reachedHead) {
					list[index++] = currNode.data;
					
					currNode = currNode.next;
					if(currNode == head) {
						reachedHead = true;
					}
				}
				
				return list;
	}
	
	public int getListSize() {
		int size = 0;
		
		if(head == null) {
			return 0;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode.next != head) {
			size++;
			
			currNode = currNode.next;
		}
		
		return size + 1;
	}

}
