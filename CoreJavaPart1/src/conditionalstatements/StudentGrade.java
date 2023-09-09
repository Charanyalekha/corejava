package conditionalstatements;

import java.util.Scanner;

public class StudentGrade {
	// Using return type as void
	void calcGrade(int marks) {
		if (marks >= 90 && marks <= 100) {
			System.out.println(" Grade :A+");
		} else if (marks >= 80 && marks <= 89) {
			System.out.println(" Grade :A");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println(" Grade :B");
		} else if (marks >= 50 && marks <= 69) {
			System.out.println(" Grade :C");
		} else {
			System.out.println(" Grade :F");
		}
	}

	// using return type as String
	String calGrade(int marks) {
		if (marks >= 90 && marks <= 100) {
			return "A+";
		} else if (marks >= 80 && marks <= 89) {
			return "A";
		} else if (marks >= 70 && marks <= 79) {
			return "B";
		} else if (marks >= 50 && marks <= 69) {
			return "C";
		} else {
			return "Fail";
		}
	}

	// Using static method
	static String calsGrade(int marks) {
		if (marks >= 90 && marks <= 100) {
			return "A+";
		} else if (marks >= 80 && marks <= 89) {
			return "A";
		} else if (marks >= 70 && marks <= 79) {
			return "B";
		} else if (marks >= 50 && marks <= 69) {
			return "C";
		} else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		StudentGrade s = new StudentGrade();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Student Marks :");
		int marks = sc.nextInt();
		sc.close();
		s.calcGrade(marks);
		System.out.println(" Grade :" + s.calGrade(marks));
		System.out.println(" Grade :" + calsGrade(marks));

	}

}
