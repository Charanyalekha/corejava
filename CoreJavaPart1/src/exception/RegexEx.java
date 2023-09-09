package exception;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEx {

	public static void main(String[] args) {
		//if the regular expression accepts 6 characters
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Monica"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Sameer"));
		System.out.println(Pattern.matches("[MS][a-z]{5}", "Anandi"));
		System.out.println();
		//quantifier example
		//[x]? x occurs once or not at all
		System.out.println(Pattern.matches("[xyz]?", "x"));
		System.out.println(Pattern.matches("[xyz]?", "xxyyyzz"));
		System.out.println();
		//[x]? x occurs once or more times
		System.out.println(Pattern.matches("[xyz]+", "x"));
		System.out.println(Pattern.matches("[xyz]+", "xxx"));
		System.out.println(Pattern.matches("[xyz]+", "xyyzz"));
		System.out.println();
		//[x]* x occurs zero or more times
		System.out.println(Pattern.matches("[xyz]*", "xyyza"));
		System.out.println(Pattern.matches("[xyz]*", "xxyyz"));
		System.out.println();
		//metacharacters examples
		//"\d", if the character sequence consists of any digits
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "1a"));
		System.out.println();
		//"\D", if the character sequence consists of any character
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "1a"));
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println();
		//to match length of characters
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "lekhak"));
		System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$", "Charanya@24"));
		
		}
	
	
	

}
