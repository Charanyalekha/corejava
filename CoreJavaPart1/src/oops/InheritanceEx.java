package oops;

class vehicle {
	String vName;

	void display() {
		System.out.println("Vehicle Name :" + vName);
	}
}

class car extends vehicle {
	int speed;

	void displaySpeed() {
		System.out.println("car speed :" + speed);
	}
}

class bike extends vehicle {
	int speed;

	void displaySpeed() {
		System.out.println("bike speed :" + speed);
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		car c = new car();
		c.vName = "BMW";
		c.speed = 60;
		c.display();
		c.displaySpeed();
		bike b = new bike();
		b.vName = "Honda";
		b.speed = 40;
		b.display();
		b.displaySpeed();
		vehicle v = new car();// passing sub class reference(Instance of subclass) to superclass.(Up casting).
		v.vName = "car";
		v.display();
		((car) v).speed = 65; // down casting(casting the objects of super class to its subclass).
		((car) v).displaySpeed();// down casting

	}

}
