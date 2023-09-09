package conditionalstatements;

import java.util.Scanner;

public class PrintArmstrongOrNot {
	public String checkArmStrong(int num) {
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			sum+=Math.pow(rem,3);
			num=num/10;
		}
		System.out.println(sum);
		if(sum==temp) {
			return temp+" is an armstrong number ";
		}else {
			return temp+" is not an armstrong number :";
		}
		
	}

	public static void main(String[] args) {
		PrintArmstrongOrNot p=new PrintArmstrongOrNot();		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt(); 
		System.out.println(p.checkArmStrong(num));
		
		
	}

}
