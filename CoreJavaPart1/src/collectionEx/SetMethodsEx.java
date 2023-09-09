package collectionEx;
import java.util.HashSet;
public class SetMethodsEx {

	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(5);
		set1.add(6);
		set1.add(7);
		HashSet<Integer> set2=new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		//union of two sets
		set1.addAll(set2);
		System.out.println(" Union of 2 sets : "+set1);
		//intersection of two sets
		set1.retainAll(set2);
		System.out.println(" Intersection of 2 sets : "+set1);
		//difference of two sets
		set1.removeAll(set2);
		System.out.println(" Difference of 2 sets : "+set1);
		
		

	}

}
