package quicksort;

public class QuickSort {
	private static void swap(int [] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static int segregate(int [] arr, int s, int e) {
		int pivotElement = arr[s];
		int counter = 0;
		
		for(int i=s+1; i<=e; i++) {
			if(arr[i] <= pivotElement) {
				counter++;
			}
		}
		
		int pivotIndex = s + counter;
		swap(arr, s, pivotIndex);
		
		int i = s, j = e;
		
		while(i < pivotIndex && j > pivotIndex) {
			if(arr[i] <= pivotElement) {
				i++;
			} else if(arr[j] > pivotElement) {
				j--;
			} else {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		return pivotIndex;
	}
	
	private static void sort(int [] arr, int s, int e) {
		if(s >= e) {
			return;
		}
		
		int pivotIndex = segregate(arr, s, e);
		
		sort(arr, s, pivotIndex - 1);
		sort(arr, pivotIndex + 1, e);
	}
	
	public static void sort(int [] arr) {
		sort(arr, 0, arr.length - 1);
	}
}
