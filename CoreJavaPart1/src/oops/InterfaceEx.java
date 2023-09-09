package oops;
interface Student1{
	 String stuName="Lekha";// variables in interface are public,static and final By default.
	void displayStuName();//methods in interface are public and abstract by default.
}
interface Marks{
	int marks=100;
	void displayMarks();
}
public class InterfaceEx implements Student1,Marks{

	public static void main(String[] args) {
		
        InterfaceEx e=new InterfaceEx(); 
        e.displayStuName();
        e.displayMarks();
	}

	@Override
	public void displayMarks() {
		System.out.println(" Student Marks :"+marks);
		
	}

	@Override
	public void displayStuName() {
		System.out.println(" Student Name :"+stuName);
		
	}

}
