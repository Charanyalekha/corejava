package oops;
//using super with variable and methods
class Book1{
	String bookName="CProgramming";
	void display() {
		System.out.println("BookNmae(Book1 class):"+bookName);
	}
}
class Book2 extends Book1{
	String bookName="JavaProgramming";
	void display() {
		super.display();//using super.methodname.
	    System.out.println("Book1Name:"+super.bookName);//using super.variablename.
		System.out.println("Book2name :"+bookName);
	}
}

public class LateBinding {

	public static void main(String[] args) {
		Book2 b=new Book2();
		b.display();
		
	}

}
