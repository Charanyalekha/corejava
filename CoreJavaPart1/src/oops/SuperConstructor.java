package oops;

class Rectangle {
	 int length;
	 int width;

	public Rectangle() {
		length = 10;
		width = 5;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int printArea() {
		return length * width;
	}
}

class Box extends Rectangle {
    int height;

	public Box() {
		super();
		height = 4;
	}

	public Box(int length,int width, int height) {
		super(length, width);
		this.height = height;
	}

	public int printVolume() {
		return printArea() * height;
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		Box box1 = new Box();
		System.out.println(" Volume of Box 1 is :" + box1.printVolume());
		System.out.println(" Area of Rectangle 1 is :" + box1.printArea());
		Box box2 = new Box(5, 6, 8);
		System.out.println(" Volume of Box 2 is :" + box2.printVolume());
		System.out.println(" Area of Rectangle 2 is :" + box2.printArea());

	}

}
