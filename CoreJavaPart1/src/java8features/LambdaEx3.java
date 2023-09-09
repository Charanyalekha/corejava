package java8features;
interface CheckStr{
	public String printStr(String str);
}

public class LambdaEx3 {

	public static void main(String[] args) {
		CheckStr sr=
	    (String str)->{
	    	String str1="";
	    	str1+=str.charAt(0);
	   
	    	for(int i=1;i<str.length();i++) {
	    		str1=str1+" "+str.charAt(i);
	    	}
	    	
	    	System.out.println(str1.length());
	    	return str1;
	    };
	    System.out.println(sr.printStr("hi"));
	    System.out.println(sr.printStr("hai"));
	}

}
