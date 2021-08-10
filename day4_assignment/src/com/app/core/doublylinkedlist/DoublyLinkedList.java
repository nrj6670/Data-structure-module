package com.app.core.doublylinkedlist;

public class DoublyLinkedList implements LinkedListIntf {
	private DoublyListNode head;
	private DoublyListNode tail;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		// Set newNode's next to empty.
		// Set newNode's previous to empty.
		DoublyListNode newNode = new DoublyListNode(element);
		// if list is empty then
		if (head == null) {
			// Set head and tail to newNode.
			head = newNode;
			tail = newNode;
			// Stop.
			return;
		}

		// Set neWNode's next to head
		newNode.next = head;
		// Set head's previous to newNode
		head.prev = newNode;
		// Set head to newNode
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		DoublyListNode newNode = new DoublyListNode(element);
		if(head == null) {
			tail = head = newNode;
			return;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		newNode.prev = currNode;
		tail = newNode;
	}

	@Override
	public int[] GetAllElements() {
		int[] listElements;
/*
		if (head == null) {
			listElements = new int[0];
			return listElements;
		}
*/
		listElements = new int[GetNodeCount()];
		int i = 0;
		DoublyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		// TODO Auto-generated method stub

	}
	@Override
	public int GetNodeCount() {
		int count = 0;
		DoublyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}
	
	@Override
	public int[] GetAllElementsInReverseOrder() {
		int [] result;
		result = new int[GetNodeCount()];
		
		if(head == null) {
			return result;
		}
		
		DoublyListNode currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		int index = 0;
		
		while(currNode != null) {
			result[index++] = currNode.data;
			currNode = currNode.prev;
		}
		
		return result;
	}
}
