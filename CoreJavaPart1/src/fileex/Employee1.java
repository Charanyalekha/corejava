package fileex;

import java.io.Serializable;

public class Employee1 implements Serializable{
	String empName;
	int empNo;
	void display() {
		System.out.println(" Employee Name :"+empName+" Employee no :"+empNo);
	}
}
