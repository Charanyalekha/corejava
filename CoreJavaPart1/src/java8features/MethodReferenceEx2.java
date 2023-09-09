package java8features;
interface Display {
	void display();
}

public class MethodReferenceEx2 {
	public void myMethod() {
		System.out.println("Method reference in Java8...");
	}
	public static void main(String[] args) {
		
		MethodReferenceEx2 e=new MethodReferenceEx2();
		Display ref=e::myMethod;
		ref.display();
	    
		
	}

}
