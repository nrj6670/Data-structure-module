package com.app.core.binarysearch;

public class BinarySearch {
	public static boolean search(int [] arr, int element) {
		int i = 0;
		int j = arr.length;
		
		while(i <= j) {
			int mid = (i + j) / 2;
			
			if(arr[mid] == element) {
				return true;
			} else if(arr[mid] < element) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		
		return false;
	}
}
