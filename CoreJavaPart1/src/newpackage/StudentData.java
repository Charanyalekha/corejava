package newpackage;

import java.util.HashMap;

class StudentDetails {
	int rollNo;
	String stuName;

	public StudentDetails(int rollNo, String stuName) {
		this.rollNo = rollNo;
		this.stuName = stuName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

}

class StudentMarks {
	int marks1, marks2, marks3;
	double avg;

	public StudentMarks(int marks1, int marks2, int marks3) {
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	public double calcAvg(int marks1, int marks2, int marks3) {
		avg = (marks1 + marks2 + marks3) / 3;
		return avg;
	}
}

public class StudentData {

	public static void main(String[] args) {
		HashMap<StudentDetails, StudentMarks> map = new HashMap<>();

	}

}
