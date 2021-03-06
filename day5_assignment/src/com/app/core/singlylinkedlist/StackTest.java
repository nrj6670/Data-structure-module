package com.app.core.singlylinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void testTopOfStack() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(23);
		stack.push(100);
		stack.push(-46);
		stack.push(0);
		
		assertTrue(stack.peek() == 0 && stack.getSize() == 5);
	}
	
	@Test
	void testPopOperation() {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(23);
		stack.push(100);
		stack.push(-46);
		stack.push(0);
		
		stack.pop();
		
		assertTrue(stack.peek() != 0 && stack.getSize() == 4);
	}

}
