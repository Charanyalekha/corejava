package collectionEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		for(Integer s:hs) {
			System.out.println(s);
		}
		hs.remove(20);
		System.out.println(hs);
		if(hs.contains(10)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		System.out.println(ts);
		for(Integer s:ts) {
			System.out.println(s);
		}
		ts.remove(30);
		System.out.println(ts);
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.addAll(hs);
		System.out.println(ts1);
		Iterator<Integer> i=ts1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ts1.removeAll(ts1);
		System.out.println(ts1);
		
		

	}

}
