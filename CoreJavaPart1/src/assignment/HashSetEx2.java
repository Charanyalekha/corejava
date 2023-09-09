package assignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class HashSetEx2 {
	public static void countVowelsConsonants(String str) {
		int vowelCount = 0, consonantCount = 0;
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			} else {
				hs.add(str.charAt(i));
			}
		}
		HashSet<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for (Character c : hs) {
			if (vowels.contains(c)) {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}

		System.out.println(" Number of Unique vowels :" + vowelCount);
		System.out.println(" Number of Unique consonants :" + consonantCount);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		countVowelsConsonants(str);

	}

}
