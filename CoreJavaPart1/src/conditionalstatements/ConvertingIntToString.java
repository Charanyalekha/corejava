package conditionalstatements;

import java.util.Scanner;

public class ConvertingIntToString {
   public static void convertIntToString(int n) {
	   String s=Integer.toString(n);
	   if(n==Integer.parseInt(s)) {
		   System.out.println(" Good job --> Integer is converted Into String : "+s);
	   }else {
		   System.out.println(" Sorry --> Not converted:");
	   }
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		convertIntToString(n);

	}

}
