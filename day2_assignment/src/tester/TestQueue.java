package tester;

import com.app.core.queue.CircularQueueTester;

public class TestQueue {
	public static void main(String[] args) {
		CircularQueueTester cqt = new CircularQueueTester();
		cqt.pushIntoQueue();
		cqt.isQueueEmpty();
		cqt.isQueueFull();
		cqt.popFromQueue();
	}
}
