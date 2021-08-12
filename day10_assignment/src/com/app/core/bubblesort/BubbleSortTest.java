package com.app.core.bubblesort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	void testBubbleSort() {
		int [] arr = new int[5];
		arr[0] = 22;
		arr[1] = 12;
		arr[2] = -13;
		arr[3] = 100;
		arr[4] = 3;
		
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		
		BubbleSort.sort(arr);
		
		System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
	void testBubbleSortOnArraySortedInIncreasingOrder() {
		int [] arr = new int[5];
		arr[0] = -13;
		arr[1] = 3;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 100;
		
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		
		BubbleSort.sort(arr);
		
		System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
	void testBubbleSortOnArraySortedInDecreasingOrder() {
		int [] arr = new int[5];
		arr[4] = -13;
		arr[3] = 3;
		arr[2] = 12;
		arr[1] = 22;
		arr[0] = 100;
		
		System.out.println("Array before sorting : " + Arrays.toString(arr));
		
		BubbleSort.sort(arr);
		
		System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
