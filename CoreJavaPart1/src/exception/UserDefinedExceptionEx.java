package exception;

public class UserDefinedExceptionEx {
	
	static void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid Age");
		}else {
			System.out.println("ValidAge");
		}
	}

	public static void main(String[] args) {
		validAge(15);

	}

}
