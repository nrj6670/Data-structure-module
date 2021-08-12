package com.app.core.linearsearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

	@Test
	void testLinearSearchingWithElementPresentInTheArray() {
		int [] arr = new int[4];
		arr[0] = 16;
		arr[2] = 0;
		arr[1] = -1;
		arr[3] = 4;
		
		int element = -1;
		
		assertTrue(LinearSearch.search(arr, element));
	}
	
	@Test
	void testLinearSearchingWithElementNotPresentInTheArray() {
		int [] arr = new int[4];
		arr[0] = 16;
		arr[2] = 0;
		arr[1] = -1;
		arr[3] = 4;
		
		int element = 22;
		
		assertFalse(LinearSearch.search(arr, element));
	}

}
