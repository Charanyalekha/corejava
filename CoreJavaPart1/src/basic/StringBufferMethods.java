package basic;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Charanya");
		System.out.println(" Original String :"+sb);
		sb.append("Lekha");
		System.out.println(" String after appending :"+sb);
		System.out.println(" Length of given String :"+sb.length());
		sb.insert(sb.length(), 'k');
		System.out.println(" String after inserting Character :"+sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(" String after deleting Character :"+sb);
		StringBuffer sb1=sb.reverse();
		System.out.println(" String after reversing the giiven String :"+sb1);
		System.out.println(" Character at 2nd position in the string :"+sb.charAt(2));
		StringBuffer reversed=new StringBuffer();
		for(int i=sb.length()-1;i>=0;i--)
		{reversed.append(sb.charAt(i));
		}
		System.out.println(" Reversed String :"+reversed);
	}

}
