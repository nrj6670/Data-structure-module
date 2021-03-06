package com.app.core.circularlinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircularLinkedListTest {

	@Test
	void testInsertOneElement() {
		CircularLinkedList list = new CircularLinkedList();
		
		int element = 22;
		list.Insert(element);
		
		int [] listItems = list.GetAllElements();
		
		assertTrue(listItems.length == 1 && listItems[listItems.length - 1] == element);
	}
	
	@Test
	void testInsertion() {
		CircularLinkedList list = new CircularLinkedList();
		
		list.Insert(12);
		list.Insert(-63);
		list.Insert(36);
		list.Insert(0);
		list.Insert(400);
		list.Insert(10);
		
		int [] result = list.GetAllElements();
		
		boolean isSorted = true;
		
		for(int i=1; i<result.length; i++) {
			if(result[i-1] > result[i]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(result.length == 6 && isSorted);
	}
	
	@Test
	void testDeleteHead() {
		CircularLinkedList list = new CircularLinkedList();
		
		list.Insert(12);
		list.Insert(-63);
		
		list.Delete(-63);
		
		int [] result = list.GetAllElements();
		
		assertTrue(list.getListSize() == 1 && result[0] == 12);
	}
	
	@Test
	void testDeleteLastElement() {
CircularLinkedList list = new CircularLinkedList();
		
		list.Insert(12);
		list.Insert(-63);
		
		list.Delete(12);
		
		int [] result = list.GetAllElements();
		
		assertTrue(list.getListSize() == 1 && result[0] == -63);
	}

}
