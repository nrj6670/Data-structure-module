package com.app.core.sortedlinkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortedLinkedListTest {
	@Test
	public void testSortedList() {
		SortedLinkedListImplementation slist = new SortedLinkedListImplementation();
		slist.Insert(3);
		slist.Insert(7);
		slist.Insert(1);
		slist.Insert(6);
		slist.Insert(2);
		slist.Insert(-88);
		
		int [] linkedListElements = slist.GetAllElements();
		
		boolean inAscendingOrder = true;
		
		for(int i=1; i<linkedListElements.length; i++) {
			if(linkedListElements[i-1] > linkedListElements[i]) {
				inAscendingOrder = false;
				break;
			}
		}
		
		assertTrue(inAscendingOrder);
	}
}