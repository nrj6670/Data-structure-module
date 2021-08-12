package com.app.core.binarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.core.linearsearch.LinearSearch;

class BinarySearchTest {

	@Test
	void testBinarySearchingWithElementPresentInTheArray() {
		int [] arr = new int[4];
		arr[0] = -1;
		arr[1] = 0;
		arr[2] = 16;
		arr[3] = 35;
		
		int element = 16;
		
		assertTrue(BinarySearch.search(arr, element));
	}
	
	@Test
	void testBinarySearchingWithElementNotPresentInTheArray() {
		int [] arr = new int[4];
		arr[0] = -1;
		arr[1] = 0;
		arr[2] = 16;
		arr[3] = 35;
		
		int element = -22;
		
		assertFalse(BinarySearch.search(arr, element));
	}

}
