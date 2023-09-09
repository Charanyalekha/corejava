package basic;

public class DeepArray {

	public static void main(String[] args) {
			int intArray[] = {0,1,2,3,4};
			int cloneArray[] = intArray.clone();
			// Deep copy is created following print statement will print false
			System.out.println(intArray == cloneArray);
			for (int i = 0; i < cloneArray.length; i++) { 
			System.out.print(cloneArray[i]+" ");
			}
			}
			}
	