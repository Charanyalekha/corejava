package exception;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class RuntimeExceptionEx {

	public static void main(String[] args) {
		try {
			int c = 20 / 0;
			System.out.println(c);
			int arr[] = { 1, 2, 3, 4, 5 };
			arr[0] = 10;
			int a = Integer.parseInt("ABC");
			System.out.println(a);
			String data = null;
			System.out.println(data.length());
			String[] data1 = new String[-5]; // throws Runtime Exception
			data1[1] = "More Data";
			Set set = new HashSet();
			set.iterator().next();
			Integer[] intArray = { 5, 7, 9, 11, 13, 15 };
			System.out.println("First element: " + intArray[0]);
			System.out.println("Last element: " + intArray[-8]);
			int[] numbers = { 1, 2, 3, 4, 5 };
			int index = -1;

			int x = numbers[index];
			System.out.println(x);

		} catch (ArithmeticException e1) {
			System.out.println(e1);
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		} catch (NumberFormatException e3) {
			System.out.println(e3);
		} catch (NullPointerException e4) {
			System.out.println(e4);
		} catch (NegativeArraySizeException e5) {
			System.out.println(e5);
		} catch (NoSuchElementException e6) {
			System.out.println(e6);
		}
	}
}
