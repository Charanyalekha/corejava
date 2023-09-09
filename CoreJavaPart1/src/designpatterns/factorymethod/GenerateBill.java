package designpatterns.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		GetPlanFactory gpf=new GetPlanFactory();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\"Enter the name of plan for which the bill will be generated: ");
		String planName=br.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units=Integer.parseInt(br.readLine());
		Plan p = gpf.getPlan(planName);
		System.out.print("Bill amount for "+planName+" of "+units+" units is: ");
		p.getRate();
		p.calculateBill(units);
 
	}

}
