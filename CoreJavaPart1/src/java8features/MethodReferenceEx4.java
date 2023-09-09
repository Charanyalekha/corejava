package java8features;

import java.util.ArrayList;
import java.util.List;

class MathEx{
	static int square(int num) {
		return num*num;
	}
}
public class MethodReferenceEx4 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(4);
		System.out.println("Using method reference....");
		list.forEach(System.out::println);
		List<Integer> list1=new ArrayList<>();
		System.out.println(" Printing numbers by calling the square method....");
		list.forEach(n -> list1.add(MathEx.square(n)));
		list1.forEach(System.out::println);
	}

}
