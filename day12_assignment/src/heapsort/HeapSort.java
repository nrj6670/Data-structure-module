package heapsort;

import java.util.Arrays;

public class HeapSort {
	public static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void heapSort(int [] arr) {
		int i = 1;
		
		while(i < arr.length) {
			int childIndex = i;
			while(childIndex > 0) {
				int parentIndex = (childIndex - 1) / 2;
				if(arr[parentIndex] < arr[childIndex]) {
					swap(arr, childIndex, parentIndex);
				}
				childIndex = parentIndex;
			}
			i++;
		}
		
		int endIndex = arr.length - 1;
		int startIndex = 0;
		
		while(startIndex <= endIndex) {
			swap(arr, endIndex, startIndex);
			int leftChildIndex = 2 * startIndex + 1;
			int rightChildIndex = 2 * startIndex + 2;
			int parentIndex = startIndex;
			
			while(leftChildIndex < arr.length - 1) {
				int minElementIndex = parentIndex;
				
				if(arr[leftChildIndex] < arr[minElementIndex]) {
					minElementIndex = leftChildIndex;
				}
				
				if(rightChildIndex < arr.length - 1 && arr[rightChildIndex] < arr[minElementIndex]) {
					minElementIndex = rightChildIndex;
				}
				if(minElementIndex == parentIndex) {
					break;
				}
				
				swap(arr, minElementIndex, parentIndex);
				parentIndex = minElementIndex;
				leftChildIndex = 2 * parentIndex + 1;
				rightChildIndex = 2 * parentIndex + 2;
				
			}
			endIndex--;
		}
	}
}
