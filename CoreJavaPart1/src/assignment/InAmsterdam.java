package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InAmsterdam {
	public int countAm(String str) {
		int count = 0;
		String arr[] = str.split(" ");
		String str2 = "Am";
		for (int i = 0; i < arr.length; i++) {
			if (str2.equalsIgnoreCase(arr[i])) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		InAmsterdam e = new InAmsterdam();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(e.countAm(str));

	}

}
