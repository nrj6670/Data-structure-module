package tester;

import java.util.Scanner;
import com.app.core.queue.QueueImplementation;

public class QueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queue capacity : ");
		QueueImplementation queue = new QueueImplementation(sc.nextInt());
		System.out.println("Is queue empty : " + queue.IsEmpty());
		queue.AddQ(1);
		queue.AddQ(2);
		queue.AddQ(3);
		queue.AddQ(4);
		System.out.println("Is queue empty now : " + queue.IsEmpty());
		System.out.println("Poped out value from queue : " + queue.DeleteQ());
		queue.AddQ(4);
		System.out.println("Is queue full : " + queue.IsFull());
		System.out.println("Poped out value : " + queue.DeleteQ());
		while(!queue.IsEmpty()) {
			System.out.println("removed value : " + queue.DeleteQ());
		}
		System.out.println(queue.DeleteQ());
		sc.close();
	}

}
