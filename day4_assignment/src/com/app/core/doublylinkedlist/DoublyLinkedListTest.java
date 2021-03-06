package com.app.core.doublylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {

	@Test
	void testEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	
	@Test
	void testAddOneAtTheRear() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		
		slist.AddAtRear(element1);
		
		int [] listElements = slist.GetAllElements();
		
		assertTrue((listElements.length == 1) && 
				(listElements[0] == element1));
		
	}
	
	@Test
	void testAddAtTheRear() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtRear(element1); // head -> 5
		slist.AddAtRear(element2); // head -> 5 -> 10

		int[] listElements = slist.GetAllElements(); // 5, 10
		
		assertTrue((listElements.length == 2) &&
				   (listElements[0] == element1) &&
				   (listElements[1] == element2));
	}
	
	@Test
	
	void getReverseList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;
		int element3 = 15;
		int element4 = 20;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5
		slist.AddAtFront(element3); // head -> 15 -> 10 -> 5
		slist.AddAtFront(element4); // head -> 20 -> 15 -> 10 -> 5
		
		int[] listElements = slist.GetAllElementsInReverseOrder(); // 5 -> 10 -> 15 -> 20
	
		boolean isReversed = true;
		
		for(int i=1; i<listElements.length; i++) {
			if(listElements[i-1] > listElements[i]) {
				isReversed = false;
				break;
			}
		}
		
		assertTrue((listElements.length == 4) &&
				   (isReversed));
	}

}
