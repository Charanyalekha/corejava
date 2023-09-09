package oops;

abstract class Figure {
	double n1;
	double n2;

	public Figure(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	abstract void printArea();
}

class Rectangle1 extends Figure {

	public Rectangle1(double n1, double n2) {
		super(n1, n2);

	}

	@Override
	void printArea() {
		System.out.println(" Area of Rectangle :" + (n1 * n2));
	}

}

class Square extends Figure {
	public Square(double n1) {
		super(n1, n1);
	}

	@Override
	void printArea() {
		System.out.println(" Area of Square :" + (n1 * n1));

	}
}

public class AbstractClassEx {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(20.0, 30.0);
		r.printArea();
		Square s = new Square(30.0);
		s.printArea();
		Rectangle1 r1 = new Rectangle1(10.0, 20.0);
		Square s1 = new Square(20.0);
		Figure fref;// We cannot create an object for abstract class.Instead of object,we can create
					// a reference for the abstract class .
		fref = r1;
		fref.printArea();
		fref = s1;
		fref.printArea();

	}

}
