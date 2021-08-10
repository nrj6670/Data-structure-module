package tester;

import java.util.Scanner;

import com.app.core.stack.StackImplementation;

public class StackTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack capacity : ");
		StackImplementation stack = new StackImplementation(sc.nextInt());
		System.out.println("Is stack empty : " + stack.IsEmpty());
		System.out.println("Is stack full : " + stack.IsFull());
		stack.Push(1);
		stack.Push(2);
		stack.Push(3);
		stack.Push(4);
		stack.Push(5);
		stack.Push(6);
		System.out.println("Poped out value : " + stack.Pop());
		stack.Push(6);
		System.out.println("Is stack empty now : " + stack.IsEmpty());
		sc.close();
	}

}
