package basic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=30,b=10,c=50;
         //unary operators
         int C= a++;
         System.out.println(" Post Increment : "+C);
         int d=++b;
         System.out.println(" Pre Increment : "+d);
         int e=--a;
         System.out.println(" Pre Decrement : "+e);
         int f=b--;
         System.out.println(" Post Decrement : "+f);
         //arithmetic operators
         int sum=a+b;
         System.out.println(" Adition of "+a+" and "+b+" is :"+sum);
         int diff=a-b;
         System.out.println(" Subtraction of "+a+" and "+b+" is :"+diff);
         int product=a*b;
         System.out.println(" product of "+a+" and "+b+" is :"+product);
         int div=a/b;
         System.out.println(" division of "+a+" and "+b+" is :"+div);
         int mod=a%b;
         System.out.println(" Modulo division of "+a+" and "+b+" is :"+mod);
         //Shift Operators
         int s1=50;
         System.out.println(" Left Shift of "+s1+" is : "+(s1<<2));
         System.out.println(" Right Shift of "+s1+" is : "+(s1>>2));
         //relational operators
         System.out.println(a+"  is greater than "+b+" ? :"+(a>b));
         System.out.println(a+"  is less than "+b+" ? :"+(a<b));
         System.out.println(a+"  is  not greater than "+b+" ? :"+!(a>b));
         //Logical operators
         System.out.println(" Logical AND :"+((a>b)&&(b>c)));
         System.out.println(" Logical OR :"+((a>b)||(b>c)));
         System.out.println(" Logical NoT :"+!((a>b)&&(b>c)));
         //bitwise operators
         System.out.println(a+" AND "+b+" :"+(a&b));
         System.out.println(a+" OR "+b+" :"+(a|b));
         System.out.println(a+" XOR "+b+" :"+(a^b));
         int s=1100;
         int t=~s;
         System.out.println(" Inversion of "+s+" is :" +t);
        //Ternary operator
         int large=(a>b)?a:b;//largest of two numbers
         System.out.println(" Largest Number is : "+large);
         int small=(a<b)?a:b;
         System.out.println(" Smallest Number is : "+small);
         String num=a%2==0?"Even":"Odd";//Number is even or odd
         System.out.println("Given number is : "+num);
         int number=(a>b&&a>c)?a:(b>a&&b>c)?b:c;//Largest of three numbers
         System.out.println(" Largest Number is : "+number);
         int marks=75;
 		 char grade =(marks<=100&&marks>=90)?'A'://student grade
 			(marks>=80&&marks<=89)?'B':
 				(marks>=70&&marks<=79)?'C':
 					(marks>=60&&marks<=69)?'D':'F'; 
 		System.out.println(" Student Grade is : "+grade);
 		//Assignment operators
 		a+=b;
 		System.out.println(a);
 		b*=c;
 		System.out.println(b);
 		c-=b;
 		System.out.println(c);
         
	}

}
