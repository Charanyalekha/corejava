package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapEx2 {
	public static void countChars(char arr[]) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.print(e.getKey() + ":" + e.getValue() + ",");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size :");
		int n = Integer.parseInt(br.readLine());
		char arr[] = new char[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().charAt(0);
		}
		countChars(arr);

	}

}
