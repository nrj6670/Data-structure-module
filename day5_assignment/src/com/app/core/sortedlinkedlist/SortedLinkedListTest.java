package com.app.core.sortedlinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedLinkedListTest {

	@Test
	void testInsertOperation() {
		SortedLinkedList slist = new SortedLinkedList();
		slist.Insert(1);
		slist.Insert(44);
		slist.Insert(0);
		slist.Insert(-56);
		slist.Insert(23);
		
		int [] res = slist.GetAllElements();
		
		boolean isSorted = true;
		
		for(int i=1; i<res.length; i++) {
			if(res[i-1] > res[i]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted && res.length == 5);
	}
	
	@Test
	void testDeleteOperation() {
		SortedLinkedList slist = new SortedLinkedList();
		slist.Insert(1);
		slist.Insert(44);
		slist.Insert(0);
		slist.Insert(-56);
		slist.Insert(23);
		
		int elementToBeDeleted = 0;
		
		slist.Delete(elementToBeDeleted);
		int [] res = slist.GetAllElements();
		assertTrue(res.length == 4);
		
		boolean deleted = true;
		
		for(int i=0; i<res.length; i++) {
			if(res[i] == elementToBeDeleted) {
				deleted = false;
				break;
			}
		}
		
		assertTrue(deleted);
	}
	
	@Test 
	void testDeleteHead() {
		SortedLinkedList slist = new SortedLinkedList();
		slist.Insert(1);
		slist.Insert(44);
		slist.Insert(0);
		
		slist.Delete(0);
		
		int [] result = slist.GetAllElements(); 
		
		assertTrue(result[0] == 1 && result.length == 2);
	}

}
