package tester;

import com.app.core.singlylinkedlist.SinglyLinkedListTest;

public class LinkedListTester {

	public static void main(String[] args) {
		SinglyLinkedListTest test = new SinglyLinkedListTest();
		try {
			test.testEmptyList();
			test.testAddAtFrontOneElement();
			test.testAddAtFrontTwoElement();
			test.testAddAtRearTwoElement();
		}catch (Exception e) {
			System.out.println("Assertion failed");
		}
	}

}
