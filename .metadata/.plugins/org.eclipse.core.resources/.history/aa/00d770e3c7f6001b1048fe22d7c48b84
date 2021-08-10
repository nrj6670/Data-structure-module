package com.app.core.singlylinkedlist;

public class SinglyLinkedList implements LinkedListIntf {
	private SinglyListNode head;
	private SinglyListNode tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	@Override
	public void AddAtFront(int element) {
		// Make space for new element, say newNode.
		// Store element in newNode's data.
		SinglyListNode newNode = new SinglyListNode(element);
		
		if(tail == null) {
			tail = newNode;
		}
		
		// Set newNode's next to head.
		newNode.next = head;

		// Set head to newNode.
		head = newNode;
	}

	@Override
	public void AddAtRear(int element) {
		// TODO Auto-generated method stub
		SinglyListNode newNode = new SinglyListNode(element);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
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
		// Set current to fist node of list.
		SinglyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// Process current node.
			listElements[i] = curr.data;
			++i;

			// Set current to current node's next.
			curr = curr.next;
		}

		return listElements;
	}

	@Override
	public void Delete(int element) {
		// Set current to fist node of list.
		SinglyListNode curr = head;

		// Set previous to empty.
		SinglyListNode prev = null;

		// while (current is not empty) do
		while (curr != tail) {
			// if current node's data is element then
			if (curr.data == element) {
				// end the loop.
				break;
			}
			// Set previous to current node.
			prev = curr;
			// Set current to current node's next
			curr = curr.next;
		}
		
		if(curr != null && curr.data == element) {
			if(curr == tail) {
				prev.next = null;
				return;
		 	}
			
			if(prev == null) {
				head = head.next;
				return;
			}
			
			prev.next = curr.next;
		}
	}

	public int GetNodeCount() {
		int count = 0;
		// Set current to fist node of list.
		SinglyListNode curr = head;

		// while (current is not empty) do
		while (curr != null) {
			// Process current node.
			++count;

			// Set current to current node's next.
			curr = curr.next;
		}

		return count;
	}
}
