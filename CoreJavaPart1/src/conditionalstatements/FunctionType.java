package conditionalstatements;

public class FunctionType {
	void add(int a,int b) {
		System.out.println(" Addition of "+a+" and "+b+" is :"+(a+b));
	}
	int sub(int a,int b) {
		return a-b;
	}
	float div(int a,int b) {
		return a/b;
	}
    String name(String fname) {
    	return fname;
    }
    static double mul(int a,int b) {
    	return a*b;
    }
	public static void main(String[] args) {
		FunctionType f=new FunctionType();
		f.add(10, 20);
		System.out.println(" Subtraction :"+f.sub(20, 10));
		System.out.println(" Division :"+f.div(20, 10));
		System.out.println(" Given name:"+f.name("Charanya"));
		System.out.println(" Multiplication:"+mul(20, 10));

		



	}

}
