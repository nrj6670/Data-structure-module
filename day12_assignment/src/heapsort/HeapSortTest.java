package heapsort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class HeapSortTest {

	@Test
	void testHeapSort() {
		int [] arr = new int[5];
		arr[1] = 36;
		arr[2] = -6;
		arr[0] = 12;
		arr[4] = 20;
		arr[3] = 100;
		//System.out.println(Arrays.toString(arr));
		HeapSort.heapSort(arr);
		
		boolean isSorted = true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}
	
	@Test
	void testSortArrayWithElementsInDescendingOrder() {
		int [] arr = new int[5];
		arr[0] = 100;
		arr[1] = 45;
		arr[2] = 12;
		arr[3] = 0;
		arr[4] = -26;
		
		HeapSort.heapSort(arr);
		
		boolean isSorted = true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}
	
	@Test
	void testAlreadySortedArray() {
		int [] arr = new int[5];
		arr[4] = 100;
		arr[3] = 45;
		arr[2] = 12;
		arr[1] = 0;
		arr[0] = -26;
		
		HeapSort.heapSort(arr);
		
		boolean isSorted = true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) {
				isSorted = false;
				break;
			}
		}
		
		assertTrue(isSorted);
	}
}
