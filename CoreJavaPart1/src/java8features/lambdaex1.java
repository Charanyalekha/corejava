package java8features;

import java.util.Arrays;
import java.util.List;

public class lambdaex1 {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1, 2, 3);
		// Single line lambda
		intSeq.forEach(x -> System.out.print(x));// intSeq.forEach(System.out::println);we can replace lambda expression
													// with method reference
		System.out.println();
		// Multi Line lambda
		intSeq.forEach(x -> {
			x += 2;
			System.out.print(x);
		});
		System.out.println();
		intSeq.forEach(x -> {
			int y = x * 2;
			System.out.print(y);
		});

	}

}
