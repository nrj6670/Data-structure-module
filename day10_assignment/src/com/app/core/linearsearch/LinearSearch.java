package com.app.core.linearsearch;

public class LinearSearch {
	public static boolean search(int [] arr, int element) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				return true;
			}
		}
		return false;
	}
}
