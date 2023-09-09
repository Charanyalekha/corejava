package oops;

import basic.ProtectedEx;

class PrivateEx {
	protected int b = 20;// scope is within the package and outside the class only through sub class.
	int c = 30;// default: scope is within the package.
	public int d = 50;// accessible anywhere.
}

class PrivateVariable {
	private int e = 40;// We can access the private variables from other classes only by putting the
						// private variable in a public method and by calling the method using that
						// class's object.

	public void display() {
		System.out.println("Value of e : " + e);
	}

	private String name;// In another Way we can access it by using getter and setter methods.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class AccessSpecifiers extends ProtectedEx {
	private int a = 10;// scope is within the class.

	public static void main(String[] args) {
		AccessSpecifiers ex = new AccessSpecifiers();
		System.out.println("value of a : " + ex.a);
		ex.n = 30;
		ex.display();
		PrivateEx p = new PrivateEx();
		System.out.println("value of b : " + p.b);
		System.out.println("value of c : " + p.c);
		System.out.println("value of d : " + p.d);
		PrivateVariable pv = new PrivateVariable();
		pv.display();
		pv.setName("Charanya");
		System.out.println("Name :" + pv.getName());

	}

}
