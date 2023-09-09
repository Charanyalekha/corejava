package conditionalstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestOf3Nums {
	 static void largest(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is the largest");
		}
		else if(b>a &&b>c) {
			System.out.println(b+" is the largest");
		}
		else {
			System.out.println(c+" is the largest");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		largest(a,b,c);

	}

}
