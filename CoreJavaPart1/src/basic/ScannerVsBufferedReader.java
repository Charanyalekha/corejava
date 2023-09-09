package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVsBufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
       //using scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your rollno :");
		int rno=sc.nextInt();
		System.out.println(rno);
		System.out.println("Enter Your Name :");
		String name=sc.next();
		System.out.println(name);
		System.out.println("Enter your percentage :");
		float percent=sc.nextFloat();
		System.out.println(percent);
		//using BufferedReader class
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your rollno :");
		int rollno=Integer.parseInt(br.readLine());
		System.out.println(rollno);
		System.out.println("Enter Your Full Name :");
		String fname=br.readLine();
		System.out.println(fname);
		System.out.println("Enter your percentage :");
		float percen=Float.parseFloat(br.readLine());
		System.out.println(percen);
		
	}

}
