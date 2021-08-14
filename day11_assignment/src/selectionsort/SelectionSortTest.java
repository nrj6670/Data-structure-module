package selectionsort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test
	void testSelectionSort() {
		int [] arr = new int[5];
		arr[1] = 22;
		arr[0] = -6;
		arr[2] = 12;
		arr[3] = 100;
		arr[4] = 45;
		
		//System.out.println("Array before sorting : " + Arrays.toString(arr));
		SelectionSort.sort(arr);
		//System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
	void testSortingArrayOfElementInDescendingOrder() {
		int [] arr = new int[5];
		arr[0] = 100;
		arr[1] = 45;
		arr[2] = 22;
		arr[3] = 12;
		arr[4] = -6;
		
		//System.out.println("Array before sorting : " + Arrays.toString(arr));
		SelectionSort.sort(arr);
		//System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
	void testSortingArrayWhichIsAlreadySorted() {
		int [] arr = new int[5];
		arr[4] = 100;
		arr[3] = 45;
		arr[2] = 22;
		arr[1] = 12;
		arr[0] = -6;
		
		//System.out.println("Array before sorting : " + Arrays.toString(arr));
		SelectionSort.sort(arr);
		//System.out.println("Array after sorting : " + Arrays.toString(arr));
		
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
