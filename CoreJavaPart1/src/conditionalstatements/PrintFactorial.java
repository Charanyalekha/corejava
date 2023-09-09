package conditionalstatements;

import java.util.Scanner;

public class PrintFactorial {
     static void calcFact(int n) {
    	 int fact=1;
    	 for(int i=2;i<=n;i++) {
    		 fact*=i;
    	 }
    	 System.out.println("The factorial of "+n+" is :"+fact);
     }
     static void calFact(int fact1,int n) {
    	 
    	 if(n==0||n==1) {
    		 fact1*=n;
    		 System.out.println(fact1);
    		 return;
    	 }
    		 fact1*=n;
    		 calFact(fact1,n-1);
    	 }
    	 
     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a Number :");
		int n=sc.nextInt();
		calcFact(n);
		int fact1=1;
		calFact(fact1,n);
		sc.close();
	}

}
