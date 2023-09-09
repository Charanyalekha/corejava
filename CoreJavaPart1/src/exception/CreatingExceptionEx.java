package exception;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class CreatingExceptionEx {
	public static void validateAge(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException(" Invalid Age :");
		} else {
			System.out.println(" Valid Age :");
		}
	}

	public static void main(String[] args) {
		try {
			validateAge(12);
		}catch(InvalidAgeException e) {
			System.out.println("Exception Occur :");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
