package oops;

abstract class Bird {
	abstract void makeSound();
	static void display() {
		System.out.println(" This is an abstract class Example :");
	}
}

class Duck extends Bird {

	@Override
	void makeSound() {
		System.out.println("The sound that a Duck makes : Quack Quack");

	}

}

class Owl extends Bird {

	@Override
	void makeSound() {
		System.out.println("The sound that an Owl makes: Hoot Hoot");

	}

}

public class AbstractClassEx2 {

	public static void main(String[] args) {
		Bird.display();
		Duck d = new Duck();
		Owl o = new Owl();
		Bird bref;
		bref = d;
		bref.makeSound();
		bref = o;
		bref.makeSound();
		

	}

}
