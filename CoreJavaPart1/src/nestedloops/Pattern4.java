package nestedloops;

import java.util.Scanner;

public class Pattern4 {
	public static void printFullPyramid(int n1) {
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void printFullPyramidStar(int n1) {
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printInvertedFullPyramidStar(int n1) {
		for (int i = n1; i >= 1; i--) {
			for (int j = 1; j <= n1 - i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		printFullPyramid(n1);
		printFullPyramid(n2);
		printFullPyramid(n3);
		printFullPyramidStar(n1);
		printInvertedFullPyramidStar(n1);
		sc.close();
	}

}
