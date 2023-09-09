package basic;
public class StringMethods {

	public static void main(String[] args) {
		String str1 = " ChArAnyA";
		String str2 = new String("LekHA");
		System.out.println(" Length of given String:" + str1.length());
		System.out.println(" Lower case String:" + str1.toLowerCase());
		System.out.println(" Upper case String:" + str1.toUpperCase());
		String str3 = str1 + str2;
		System.out.println(" Concatenated String:" + str3);
		System.out.println(" index:" + str1.indexOf('n'));
		System.out.println(" last index:" + str1.lastIndexOf('A'));
		String str4 = "Lekha";
		System.out.println(" Two Strings are equal :" + str2.equals(str4));
		System.out.println(" Two Strings are equal :" + str2.equalsIgnoreCase(str4));
		System.out.println(" Contains Method :" + str1.contains("ArAnyA"));
		System.out.println(" String ends with:" + str2.endsWith("A"));
		System.out.println(" String starts with:" + str2.startsWith("A"));
		String str5 = " ";
		System.out.println(" String is empty:" + str5.isEmpty());
		System.out.println(" String is blank:" + str5.isBlank());
		System.out.println(" Repeat String :" + str2.repeat(3));
		System.out.println(" Trim method:" + str3.trim());
		System.out.println(" SubString method:" + str3.substring(9));
		// To print individual characters of a string
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		// To compare Contents of the string
		System.out.println(str1 + "  is same as " + str2 + " :" + str1.contentEquals(str2));
		// To compare two strings
		System.out.println(" Compare two Strings :" + "LEKHA".compareTo("LEKHA"));
		// To compare two strings Ignoring the case
		System.out.println(" Compare two Strings :" + "Lekha".compareToIgnoreCase("LEKHA"));
		// To Convert String into Character array
		char arr[] = str2.toCharArray();
		System.out.println(" The character array is :");
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(" String after replacing A With @:" + str3.replace('A','@'));

	}
}
