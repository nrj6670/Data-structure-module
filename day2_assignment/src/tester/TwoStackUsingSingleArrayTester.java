package tester;

import com.app.core.stack.TwoStackUsingSingleArray;
import java.util.Scanner;

public class TwoStackUsingSingleArrayTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stack size : ");
		TwoStackUsingSingleArray stacks = new TwoStackUsingSingleArray(sc.nextInt());
		
		
		
		sc.close();
	}

}
