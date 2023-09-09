package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArraysInitialisation {

			public static void main(String[] args) throws NumberFormatException, IOException {
			
				int ar2[]=new int[10];//array declaration with size
				
				//initialization static, dynamic
			
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				//input stream - System.in
				
				
				//Dynamic initialization of an array
				for(int i=0;i<10;i++)
				{
					System.out.println("Enter a value:");
					ar2[i]=Integer.parseInt(bufferedReader.readLine());
					
				}
			    // accessing array elements	
				for(int i=0;i<10;i++)
				{
					System.out.print(ar2[i]+" ");
							
				}
				System.out.println();
				//accessing the array elements- looping through in reverse order
				for(int i=9;i>=0;i--)
				{
					System.out.print(ar2[i]+" ");
							
				}
				

			}

		}


