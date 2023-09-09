package java8features;

interface One {
	void msg1();

	default void display() {
		System.out.println("We can write default methods in interface....");
	}

	static void displayStatic() {
		System.out.println("We can also write static methods in interface.....");
	}
}

interface Two {
	void msg2();
}

public class DefaultStatic implements One, Two {

	public static void main(String[] args) {
		DefaultStatic ds = new DefaultStatic();
		ds.display();
		ds.msg1();
		ds.msg2();
		One.displayStatic();

	}

	@Override
	public void msg1() {
		System.out.println(" This is the abstract method in the interface One....");

	}

	@Override
	public void msg2() {
		System.out.println(" This is the abstract method in  the interface Two....");

	}

}
