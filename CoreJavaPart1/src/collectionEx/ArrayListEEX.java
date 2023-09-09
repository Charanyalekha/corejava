package collectionEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEEX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			for(int j=0;j<d;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
       for(int i=0;i<n;i++) {
    	   int x=sc.nextInt()-1;
    	   int y=sc.nextInt()-1;
    	   if(arr[x][y]!=0) {
    		  System.out.println(list1.add(arr[x][y])); 
    	   }else {
    		   System.out.println("ERROR!");
    	   }
       }
       sc.close();

	}

}
