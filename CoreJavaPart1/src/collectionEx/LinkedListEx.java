package collectionEx;

import java.util.LinkedList;
import java.util.Set;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("lekha");
		list.addFirst("charanya");
		list.addLast("k");
		list.add("cherry");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.pollFirst();
		System.out.println(list);
		list.pollLast();
		System.out.println(list);
		list.poll();
		System.out.println(list);
		
	}

}
