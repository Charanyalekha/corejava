package collectionEx;

import java.util.Hashtable;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable();
              ht.put(1, "sunday");
              ht.put(2, "monday");
              ht.put(3, "tuesday");
              ht.putIfAbsent(1, "wednesday");
              ht.putIfAbsent(4, "thursday");
              System.out.println(ht);
              System.out.println(ht.get(2)); 
              Set<Integer> keys=ht.keySet();
              for(int key:keys) {
             	 System.out.println(key+" "+ht.get(key));
              }
             
	}

}
