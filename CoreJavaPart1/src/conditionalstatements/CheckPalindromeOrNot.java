package conditionalstatements;

import java.util.Scanner;

public class CheckPalindromeOrNot {
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	// Reverse a String
	public static void reverseString(String str1, int idx) {
		if (idx == 0) {
			System.out.println(str1.charAt(idx));
		} else {
			System.out.println(str1.charAt(idx));
			reverseString(str1, idx - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		String str1 = sc.next();
		reverseString(str1, str1.length() - 1);
	}

}
