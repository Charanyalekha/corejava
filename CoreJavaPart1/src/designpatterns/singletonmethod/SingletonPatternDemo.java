package designpatterns.singletonmethod;

public class SingletonPatternDemo {
//In this pattern, we are creating single instance of the class and all other classes needs to use the same instance to access the class.
	public static void main(String[] args) {
		SingleObject object=SingleObject.getInstance();
		object.showMessage();

	}

}
