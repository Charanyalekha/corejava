package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceEx {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(122, 56, 43, 22, 13, 5, 59,56);
		System.out.println("My List :"+num);
        System.out.println("lambda func.....");
		Collections.sort(num, (i1,i2) -> i1.compareTo(i2));
		num.forEach(System.out::println);
		System.out.println();
		//we can replace lambda expression with method reference.
		System.out.println("Anonymous function.....");
        num.forEach(System.out::print);
	}

}
