package tester;

import java.util.Scanner;

import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input bracket string : ");
		String input = sc.next();
		Stack<Character> stk = new Stack<>();
		
		boolean isBalanced = true;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == '(' || input.charAt(i) == '[') {
				stk.push(input.charAt(i));
			} else {
				if(input.charAt(i) == ')') {
					if(stk.peek() == '(') {
						stk.pop();
					} else {
						isBalanced = false;
						break;
					}
				} else {
					if(stk.peek() == '[') {
						stk.pop();
					} else {
						isBalanced = false;
						break;
					}
				}
			}
		}
		
		if(isBalanced) {
			System.out.println("Input string is balanced");
		} else {
			System.out.println("Input string is not balanced");
		}
		
		sc.close();
	}
}
