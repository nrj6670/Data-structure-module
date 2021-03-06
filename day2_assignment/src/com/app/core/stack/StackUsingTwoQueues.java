package com.app.core.stack;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingTwoQueues {
	private Queue<Integer> q1;
	private Queue<Integer> q2;
	
	public StackUsingTwoQueues() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}
	
	public void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		
		q1.add(data);
		
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}	
	}
	
	public int pop() {
		if(q1.isEmpty()) {
			System.out.println("Queue is empty.");
			return Integer.MIN_VALUE;
		}
		
		return q1.poll();
	}
	
	public int getSize() {
		return q1.size();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}
