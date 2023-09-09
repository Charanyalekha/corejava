package basic;

public class ShallowArray {

	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		int cloneArray[] = intArray.clone();
		// shallow copy is created following print statement will print true 
		System.out.println(intArray[0] == cloneArray[0]); 
		System.out.println(intArray[1] == cloneArray[1]);

	}
}
