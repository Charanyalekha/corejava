package assignment;

interface Validate{
	boolean isValid(String firstName, String lastName);
}
interface CheckStr1{
	public String printStr(String str);
}
public class Source {
	public boolean validate(String username,String password) {
		Validate v=(str1,str2)->{
			if((str1.equals("ABC"))&&(str2.equals("DEF"))){
			return true;
			}else {
				return false;
			}
		};
		
     return v.isValid(username, password);
	}
	
	public String insertSpacce(String s) {
		CheckStr1 sr=
			    (String str)->{
//			    	String str1="";
//			    	str1+=str.charAt(0);
//			   
//			    	for(int i=1;i<str.length();i++) {
//			    		str1=str1+" "+str.charAt(i);
//			    	}
//			    	
//			    	System.out.println(str1.length());
//			    	return str1;
			    	String str1=str.replace("", " ").trim();
			    	System.out.println(str1.length());
			    	return str1;
			    };
			    return sr.printStr(s);
	}
		
	public static void main(String[] args) {
	
	Source s=new Source();
	System.out.println(s.validate("ABC", "DEF"));
    System.out.println(s.insertSpacce("hi"));
    System.out.println(s.insertSpacce("capgemini"));
	}

}
