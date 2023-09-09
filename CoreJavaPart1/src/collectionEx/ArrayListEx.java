package collectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(20);
		System.out.println("ArrayList Size :" + arr.size());
		System.out.println("Array List --->" + arr);
		for (int i : arr) {
			System.out.println(i);
		}
		arr.remove(0);
		System.out.println("Array List --->" + arr);
		arr.set(1, 50);
		System.out.println("Array List --->" + arr);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(arr);
		System.out.println("Array List --->" + list);
		Collections.sort(list);
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println(list.contains(20));
		Collections.reverse(list);
		for(int i:list) {
			System.out.println(i);
		}
		List<Integer> list1 = Arrays.asList(10, 4, 2, 6, 5, 8);
        Collections.sort(list1, Collections.reverseOrder());
 
        System.out.println(list1);

	}

}
