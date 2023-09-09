package exception;

public class CompileTimeExceptionEx {

	public static void main(String[] args) {
		try {
			Class.forName("InterfaceEx.java");
			System.out.println(" Class Found :");
		}
		catch(Exception e) {
			System.out.println(" Class Not Found :"+e);
		}
		finally {
			System.out.println(" Finally Block :");
		}
	}

}
