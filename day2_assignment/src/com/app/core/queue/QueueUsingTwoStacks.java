package com.app.core.queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueUsingTwoStacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	public void push(int data) {
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		s1.push(data);
		
		while(!s1.empty()) {
			s2.push(s1.pop());
		}
	}
	
	public int pop() {
		if(s2.isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		
		return s2.pop();
 	}
	
	public boolean isEmpty() {
		return s2.isEmpty();
	}
	
	public int getSize() {
		return s2.size();
	}
}
