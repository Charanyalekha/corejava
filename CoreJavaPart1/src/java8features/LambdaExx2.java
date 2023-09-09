package java8features;
interface MyInterface{
	public int displayMathOp(int a,int b);
}
interface EvenOdd{
	public int checkEvenOdd(int a);
}
interface StrRev{
	public String disRev(String str);
}

public class LambdaExx2 {

	public static void main(String[] args) {
		MyInterface mi=(int a,int b)->a+b;
		System.out.println(" Sum  is :"+mi.displayMathOp(5, 5));
		MyInterface mi1=(int a,int b)->a-b;
		System.out.println(" Difference  is :"+mi1.displayMathOp(5, 2));
		MyInterface mi2=(int a,int b)->a*b;
		System.out.println(" product  is :"+mi2.displayMathOp(5, 5));
		MyInterface mi3=(int a,int b)->a/b;
		System.out.println(" remainder is :"+mi3.displayMathOp(5, 5));
		EvenOdd eo=(int a)->{
			if(a%2==0) {
				System.out.println("Even no:");
			}else {
				System.out.println("Odd no:");
			}
			return a;
		};
		System.out.println(eo.checkEvenOdd(6));
		StrRev sr=(String str)->{
			String str1="";
			for(int i=str.length()-1;i>=0;i--) {
				str1+=str.charAt(i);
			}
			return str1;
		};
		System.out.println(sr.disRev("Lekha"));
		

	}

}
