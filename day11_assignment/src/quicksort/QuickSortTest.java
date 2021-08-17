package quicksort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	void testQuickSort() {
		int [] arr = new int[5];
		arr[0] = 26;
		arr[1] = -6;
		arr[2] = 0;
		arr[3] = 100;
		arr[4] = 12;
		
		QuickSort.sort(arr);
		//System.out.println("Sorted arr : " + Arrays.toString(arr));
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
	void testQuickSortOnSortedArray() {
		int [] arr = new int[5];
		arr[0] = -6;
		arr[1] = 0;
		arr[2] = 12;
		arr[3] = 26;
		arr[4] = 100;
		
		QuickSort.sort(arr);
		//System.out.println("Sorted arr : " + Arrays.toString(arr));
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
	void testQuickSortOnArrayWithElementsInDecreasingOrder() {
		int [] arr = new int[5];
		arr[4] = -6;
		arr[3] = 0;
		arr[2] = 12;
		arr[1] = 26;
		arr[0] = 100;
		
		QuickSort.sort(arr);
		//System.out.println("Sorted arr : " + Arrays.toString(arr));
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
