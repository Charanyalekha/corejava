package java8features;

public class ConversionsEx {

	public static void main(String[] args) {
		int a=12;//Decimal
		String b = Integer.toBinaryString(a);
		String c=Integer.toHexString(a);
		String d=Integer.toOctalString(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
