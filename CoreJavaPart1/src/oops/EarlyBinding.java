package oops;

public class EarlyBinding {
	int display(int a,int b) {
		return a+b;
	}
	float display(float a,int b) {
		return a+b;
	}
	float display(int a,float b) {
		return a+b;
	}
	float display(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		EarlyBinding eb=new EarlyBinding();
	System.out.println("Sum :"+eb.display(10, 20));	
	System.out.println("Sum :"+eb.display(2.0f, 30));
	System.out.println("Sum :"+eb.display(30, 4.0f));
	System.out.println("Sum :"+eb.display(3.0f, 5.0f));	

	}

}
