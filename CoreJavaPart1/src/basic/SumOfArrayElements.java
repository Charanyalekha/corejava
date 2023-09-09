package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrayElements {

	public static void main(String[] args)throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		int arr[]=new int[8];
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element at "+ i +" index position");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(" Sum Of the Array elements :"+sum);
		int evenSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenSum+=arr[i];
			}
		}
		System.out.println("Sum of even elements of the array :"+evenSum);
		int oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddSum+=arr[i];
			}
		}
		System.out.println("Sum of odd elements of the array :"+oddSum);
	}
}
