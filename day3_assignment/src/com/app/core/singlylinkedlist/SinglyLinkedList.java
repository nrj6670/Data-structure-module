package com.app.core.singlylinkedlist;


public class SinglyLinkedList implements LinkedListIntf {
	private SinglyListNode head;

	public SinglyLinkedList() {
		head = null;
	}

	@Override
	public void AddAtFront(int element) {
		SinglyListNode newNode = new SinglyListNode(element);
		newNode.next = head;
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		if(head == null) {
			head = new SinglyListNode(element);
			return;
		}
		
		SinglyListNode currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = new SinglyListNode(element);
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
		SinglyListNode curr = head;

		while (curr != null) {
			listElements[i] = curr.data;
			++i;
			curr = curr.next;
		}

		return listElements;
	}

	public int GetNodeCount() {
		int count = 0;
		SinglyListNode curr = head;

		// Algo: While current is not empty.
		while (curr != null) {
			++count;
			curr = curr.next;
		}

		return count;
	}
}
