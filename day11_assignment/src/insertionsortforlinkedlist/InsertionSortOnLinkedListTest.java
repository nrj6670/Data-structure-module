package insertionsortforlinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class InsertionSortOnLinkedListTest {
	
	@Test
	void testInsertionSortWithListItemInDescendingOrder() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.AddAtRear(23);
		list.AddAtRear(16);
		list.AddAtRear(12);
		list.AddAtRear(6);
		list.AddAtRear(0);
		list.AddAtRear(-22);
		
		InsertionSortForLinkedList.sort(list);
		int [] sortedList = list.GetAllElements();
		
		boolean isSorted = true;
		
		for(int i=0; i<sortedList.length - 1; i++) {
			if(sortedList[i] > sortedList[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}
	
	@Test
	void testInsertionSort() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.AddAtRear(23);
		list.AddAtRear(-2);
		list.AddAtRear(6);
		list.AddAtFront(12);
		list.AddAtRear(100);
		list.AddAtRear(-22);
		
		InsertionSortForLinkedList.sort(list);
		int [] sortedList = list.GetAllElements();
		boolean isSorted = true;
		
		for(int i=0; i<sortedList.length - 1; i++) {
			if(sortedList[i] > sortedList[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}
	
	@Test
	void testInsertionSortOnSortedList() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.AddAtRear(6);
		list.AddAtRear(32);
		list.AddAtRear(41);
		list.AddAtFront(0);
		list.AddAtRear(100);
		list.AddAtFront(-22);
		
		InsertionSortForLinkedList.sort(list);
		int [] sortedList = list.GetAllElements();
		
		boolean isSorted = true;
		
		for(int i=0; i<sortedList.length - 1; i++) {
			if(sortedList[i] > sortedList[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}

}
