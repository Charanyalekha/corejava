package oops;

class Department {
	int deptId;
	String deptName;
	
	public Department() {
		deptId=1000;
		deptName="Compter Science";
	}
}

class Lecturer extends Department {
	
	String lecturerName;
	String lecturerSub;

	public Lecturer(String lecturerName,String lecturerSub ) {
		this.lecturerName=lecturerName;
		this.lecturerSub=lecturerSub;
		System.out.println(" Department Id: " + deptId + " DepartmentName :" + deptName + 
				" LecturerName :" + lecturerName+" Lecturer Subject :"+lecturerSub);
	}
}

class Student extends Department {
	int stuId;
	String stuName;
    public Student(int stuId,String stuName) {
    	this.stuId=stuId;
    	this.stuName=stuName;
    	System.out.println(" Department Id: " + deptId + " DepartmentName :" + deptName + " Student Id :" + stuId
				+ " Student Name :" + stuName);
    }

}

public class HierarchicalInheritance {

	public static void main(String[] args) {
       Lecturer l1=new Lecturer("Princy","Cloud Computing");
       Lecturer l2=new Lecturer("Virat","Networking");
       System.out.println("---------------------------------------------------------------------------------------");
       
       Student s1=new Student(10,"Charanya");
       Student s2=new Student(20,"Lekha");
       
	}

}
