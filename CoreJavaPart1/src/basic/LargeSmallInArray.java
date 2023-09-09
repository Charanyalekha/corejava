package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LargeSmallInArray {
			public static void main(String[] args) throws NumberFormatException, IOException {
				
				int ar[]=new int[10];
				
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				
				for(int i=0;i<ar.length;i++)
				{
					System.out.println("Enter the element at "+ i +" index position");
					ar[i]=Integer.parseInt(bufferedReader.readLine());
					
				}
				
				int max=ar[0];
				int min=ar[0];
				
				for(int i=0;i<ar.length;i++) //[12,7,67,89,34,23] max=12 min=12
				{
					if(ar[i]>max)    //12>12 7>12 67>12(max=67)  89>67(max=89) 89>34 89>23
					{
						max=ar[i];
					}
					
					if(ar[i]<min) //12 
					{
						min=ar[i];
					}
				}
				
				System.out.println(max);
				System.out.println(min);
			}

		}
