package designpatterns.singletonmethod;

public class SingleObject {
	private static SingleObject instance = new SingleObject();

	private SingleObject() {// It will not allow us to create another object for this class so that this
							// class can contain only single instance.
	}

	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}
