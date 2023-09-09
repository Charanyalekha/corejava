package nestedloops;

import java.util.Scanner;

public class Pattern2 {
	public static void printCapitalLetters(int n) {
	   // To print alphabets
		for(int i=n;i<=n+5;i++) {
			for(int j=n;j<=i;j++) {
				char k=(char)j;
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
	}
	public static void printMatrixPattern(int n1) {
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	//to print hollow square pattern
	public static void printHollowSquare(int n1) {
		for(int i=0;i<=n1;i++) {
			for(int j=0;j<=n1;j++) {
				if(i==0||j==0||i==n1||j==n1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	// to print full pyramid
	public static void printFullPyramid(int n1) {
		for(int i=0;i<n1;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print(" ");
				
			}
			for(int j=0;j<i;j++) {
				System.out.println("*");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		printCapitalLetters(n);
		int n1=sc.nextInt();
		printMatrixPattern(n1);
		printHollowSquare(n1);
		printFullPyramid(n1);
		
		
		
}
}
