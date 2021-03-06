package tester;

import java.util.Arrays;
import java.util.Scanner;
import com.app.core.stack.StackImplementation;
import com.app.core.stack.StackIntf;



public class ReverseArrayElements {
	
	public static void reverseArray(int [] arr, StackIntf stack) {
		if(arr.length == 0) {
			System.out.println("Input array is empty");
			return;
		}
		
		for(int el : arr) {
			stack.Push(el);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stack.Pop();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		StackImplementation stack = new StackImplementation(size);
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Input array : " + Arrays.toString(arr));
		reverseArray(arr, stack);
		System.out.println("Reversed array : " + Arrays.toString(arr));
		
		sc.close();
	}

}
