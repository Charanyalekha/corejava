package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "charanya");
		map.put("2", "lekha");
		map.putIfAbsent("3", "k");
		Map<String, String> map1 = new HashMap<String, String>();
		map1.putAll(map);
		map1 = (HashMap<String, String>) map.clone();
		System.out.println(map1);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("k"));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
		for (Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		HashMap<String,Integer> map2=new HashMap<String, Integer>();
		map2.put("cherry", 60);
		map2.put("lekha",50);
		int val=map2.merge("cherry", 40, (val1,val2)->val1+val2);
		System.out.println("Updated value :"+val);
		Set<String> keys1=map2.keySet();
		for(String key:keys1) {
			System.out.println(key+":"+map2.get(key));
		}
       
	}

}
