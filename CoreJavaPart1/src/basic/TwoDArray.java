package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TwoDArray {
			public static void main(String[] args) throws NumberFormatException, IOException {
				
				int ar[][]=new int[3][3];
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
				//initialization
				for(int i=0;i<3;i++) //rows 
				{
					for(int j=0;j<3;j++)//columns
					{
						System.out.println("Enter value at ["+i+"]["+j+"] position:");
						ar[i][j]=Integer.parseInt(bufferedReader.readLine());
					}
				}
				
				
				//print
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(ar[i][j]+ " ");
						
					}
					System.out.println();
				}

			}

		}

