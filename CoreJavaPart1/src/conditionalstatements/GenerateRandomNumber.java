package conditionalstatements;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int x=random.nextInt(100);
		
		do {
			System.out.println(" Guess the number :");
			int guess=sc.nextInt();
			if(guess>x) {
				System.out.println(" Too High, try again.");
			}else if(guess<x) {
				System.out.println(" Too Low, try again.");
			}else {
				System.out.println(" Your guess is correct.");
				break;
			}
			}while(true);
		sc.close();
			
		}
	}


