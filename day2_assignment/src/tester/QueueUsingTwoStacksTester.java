package tester;

import java.util.Scanner;
import com.app.core.queue.QueueUsingTwoStacks;

public class QueueUsingTwoStacksTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		
		while(true) {
			System.out.println("Enter any number to insert in the queue or -1 to exit ");
			int input = sc.nextInt();
			if(input == -1) {
				break;
			}
			queue.push(input);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.pop());
		}
		
		sc.close();
	}

}
