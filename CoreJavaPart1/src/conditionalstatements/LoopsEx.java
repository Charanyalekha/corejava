package conditionalstatements;

public class LoopsEx {

	public static void main(String[] args) {
		
		// for loop
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		// while loop
		int i=1;
		while(i>10){
			System.out.println(i);
			i--;
		} ;
		//do-while loop
		int j=0;
		String str="Charanya";
		do {
			System.out.println(str);
			j++;
		}while(j<10);
		//to reverse a given number
		int num=123, reverseNum=0;
		int temp=num;
		while(num!=0) {
			int remainder=num%10;
			reverseNum=reverseNum*10+remainder;
			num=num/10;
		}
		System.out.println(reverseNum);
		if(temp==reverseNum) {
			System.out.println(reverseNum+" is a palindrome :");
		}else {
			System.out.println(reverseNum+" is not a palindrome :");
		}
		//reverse a string
		String str1="hello";
		String str2="";
		for(int k=str1.length()-1;k>=0;k--) {
			str2+=str1.charAt(k);
	}
		System.out.println(str2);
	

}
}
