package assignment;

import java.math.BigInteger;

public class ConvertStrToInt {
	public static String string_multiply(String A, String B) {
		BigInteger n1=new BigInteger(A);
		BigInteger n2=new BigInteger(B);
		BigInteger n3=n1.multiply(n2);
		return n3.toString();
	}

	public static void main(String[] args) {
		String A="22";
		String B="25";
		System.out.println(string_multiply(A, B));

	}

}
