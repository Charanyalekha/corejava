package oops;

interface Parent1 {
	void displayParent1();// all the methods inside the interface are abstract and public by default.
}

interface Parent2 {
	void displayParent2();
}

interface Child extends Parent1, Parent2 {
	void displayChild();
}

public class MultipleInheritanceEx implements Child {

	public static void main(String[] args) {

		MultipleInheritanceEx ex = new MultipleInheritanceEx();
		ex.displayParent1();
		ex.displayParent2();
		ex.displayChild();
	}

	@Override
	public void displayParent1() {
		System.out.println("This is Parent1 interface Method.");

	}

	@Override
	public void displayParent2() {
		System.out.println("This is Parent2 interface Method.");

	}

	@Override
	public void displayChild() {
		System.out.println("This is child interface Method.");

	}

}
