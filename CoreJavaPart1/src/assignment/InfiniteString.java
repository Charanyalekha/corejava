package assignment;

//import java.util.ArrayList;

public class InfiniteString {
	public static void main(String[] args) {
		String base = "abc";
		String sub = "abcabc";

		boolean containsSub = checkString(base, sub);// here i am checking substring in infinite string

		if (containsSub) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static boolean checkString(String base, String sub) {
//		ArrayList<String> arr=new ArrayList<>();
//		boolean flag = false;
//		for (int i=0;i<base.length();i++) {
//			arr.add(sub.substring(base.length()-1));
//		}
//		for(int i=0;i<base.length();i++) {
//			if(arr.get(i)==base) {
//			     flag=true;
//			}else {
//				flag=false;
//			}
//		}
//		return flag;
//	}
//}	
//
		StringBuilder infiniteString = new StringBuilder();

		while (infiniteString.length() < sub.length()) {
			infiniteString.append(base);
	     }
////
       return infiniteString.toString().startsWith(sub);
	}
}


