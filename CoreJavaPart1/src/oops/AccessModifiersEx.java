package oops;

class PublicEx1 {// Accessible within the package and outside the package also(accessible
					// everywhere).
	public int empNo;

	public void displayEmpNo() {
		System.out.println("Employee Number : " + empNo);
	}
}

class DefaultEx1 {// accessible within the package but cannot be accessed from outside the
					// package.
	String empName;

	void displayName() {
		System.out.println("Employee Name : " + empName);
	}
}

class ProtectedEx1 {// Accessible within the package and outside the package only through sub class.
	protected int empSalary;

	protected ProtectedEx1(int empSalary) {
		this.empSalary = empSalary;
		System.out.println("Employee Salary :" + empSalary);
	}
}

class PrivateEx1 {
	private int empAccNo;// To access the private variable from outside the class ,

	public void displayAccNo(int accNo) {// we have to pass that private variable in a public method.
		empAccNo = accNo;
		System.out.println("Employee Account No : " + empAccNo);
	}

	private long mobileNo;// or by using getter and setter methods.

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

}

public class AccessModifiersEx {
	private String empLoc;// accessible within the class only.

	private void displayEmpLoc() {// private methods are accessible within the class only.
		System.out.println("Employee Location :" + empLoc);
	}

	public static void main(String[] args) {
		PublicEx1 ex1 = new PublicEx1();
		ex1.empNo = 10000;
		ex1.displayEmpNo();
		DefaultEx1 ex2 = new DefaultEx1();
		ex2.empName = "John";
		ex2.displayName();
		ProtectedEx1 ex3 = new ProtectedEx1(25000);
		AccessModifiersEx ex4 = new AccessModifiersEx();
		ex4.empLoc = "Hyderabad";
		ex4.displayEmpLoc();
		;
		PrivateEx1 ex5 = new PrivateEx1();
		ex5.displayAccNo(56342789);
		ex5.setMobileNo(9675432876l);
		System.out.println("Employee Mobile Number : " + ex5.getMobileNo());

	}

}
