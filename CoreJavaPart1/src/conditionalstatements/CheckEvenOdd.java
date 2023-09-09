package conditionalstatements;

import java.util.Scanner;

public class CheckEvenOdd {
	void checkEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even ");
		} else {
			System.out.println(n + " is odd ");
		}
	}

	public static void main(String[] args) {
		CheckEvenOdd num = new CheckEvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number :");
		int n = sc.nextInt();
		sc.close();
		num.checkEvenOdd(n);
	}

}
