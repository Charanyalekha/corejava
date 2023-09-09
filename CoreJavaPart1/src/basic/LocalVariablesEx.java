package basic;

public class LocalVariablesEx {
	String empLocat;
	static int age;
	public void display() {
		int empNo=10;
	    String empName="Sahithi";
		int empAge=24;
		System.out.println(" Employee number : "+empNo);
	    System.out.println(" Employee Name: " +empName);
	    System.out.println(" Employee Age: "+empAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariablesEx emp=new LocalVariablesEx();
		emp.display();
		emp.empLocat="Chennai";
		age=30;

	}

}
