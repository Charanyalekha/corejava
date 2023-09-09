package oops;
 class FinalUsage{//final class cannot be extended.
	final void display() {
		System.out.println(" This is a final method :");
	}
}

public class FinalEx extends FinalUsage{
	final int a=10;
//	void display() {
//		
//	}// final method cannot be overridden.

	public static void main(String[] args) {
	   FinalEx f=new FinalEx();
	  // f.a=15;// we cannot modify final variable once it is initialised.
        System.out.println(" Value of final variable :"+f.a);
	}

}
