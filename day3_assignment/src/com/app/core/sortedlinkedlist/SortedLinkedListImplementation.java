package com.app.core.sortedlinkedlist;

public class SortedLinkedListImplementation implements SortedLinkedListIntf {

	SinglyListNode head;
	
	public SortedLinkedListImplementation() {
		head = null;
	}
	@Override
	public void Insert(int element) {
		if(head == null) {
			head = new SinglyListNode(element);
			return;
		}
		
		SinglyListNode newNode = new SinglyListNode(element);
		
		if(head.data > element) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		SinglyListNode currNode = head;
		
		while(currNode.next != null && currNode.next.data < element) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
	}
	
	@Override
	public int[] GetAllElements() {
		int [] result = new int[getNodeCount()];
		int currIndex = 0;
		SinglyListNode currNode = head;
		
		while(currNode != null) {
			result[currIndex++] = currNode.data;
			currNode = currNode.next;
		}
		
		return result;
	}
	@Override
	public int getNodeCount() {
		int counter = 0;
		
		SinglyListNode currNode = head;
		
		while(currNode != null) {
			counter++;
			currNode = currNode.next;
		}
		
		return counter;
	}

}
