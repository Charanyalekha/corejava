package assignment;

import java.util.Scanner;

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}

}

public class ValidateName {
	public String checkName(String fName, String lName) throws MyException {
		if (fName.isEmpty()) {
			throw new MyException(" First Name should not be empty");
		} else if (lName.isEmpty()) {
			throw new MyException(" Last Name should not be empty ");
		} else
			return "Welcome " + fName + " " + lName;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String fName = sc.nextLine();
			String lName = sc.nextLine();
			ValidateName v = new ValidateName();
			System.out.println(v.checkName(fName, lName));
		} catch (MyException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
