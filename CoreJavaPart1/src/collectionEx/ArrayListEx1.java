package collectionEx;

import java.util.ArrayList;
import java.util.Scanner;

class Student2 {
	int sNo;
	String sName;
    String sGrade;
    public Student2() {
		
	}

	public Student2(int sNo, String sName,String sGrade) {
		this.sNo = sNo;
		this.sName = sName;
		this.sGrade=sGrade;
	}	
}

public class ArrayListEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student2 s=new Student2();
		ArrayList<Student2> aList = new ArrayList<Student2>();
		int choice;
		do {
			System.out.println(" Enter your Choice :--> 1.Enter Student Details, 2.Display Student Details, 3.Remove Student details or 4.exit");
			 choice = sc.nextInt();
			switch (choice) {
			case 1://1.to enter student details
				System.out.println(" Enter Student details ....");
				System.out.print(" Enter Student Rollno :");
				int sNo = sc.nextInt();
				System.out.print(" Enter Student Name :");
				String sName = sc.next();
				System.out.print(" Enter Student Grade :");
				String sGrade=sc.next();
				aList.add(new Student2(sNo, sName,sGrade));
				break;
			case 2://2.to display student details
				System.out.println(" Student Details are.....");
				for (Student2 st : aList) {
					System.out.println("Student RollNo : " + st.sNo);
					System.out.println("Student Name : " + st.sName);
					System.out.println("Student Grade : "+st.sGrade);
					System.out.println("--------------------------------------");
				}
				break;
			case 3://3.to delete student details
				System.out.println("Enter index to remove student details..:");
				int n = sc.nextInt();
				aList.remove(n);
				break; 
			case 4:break;//4.to exit 
			default :System.out.println(" Invalid Choice...");
			}
		} while (choice!=4);
		sc.close();

	}
}
