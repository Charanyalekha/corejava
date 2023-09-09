package collectionEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Emp implements Comparable<Emp> {
	private String name;
	private int salary;

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}

	
//	public int compareTo(Emp e) {
//		if (this.getSalary() > e.getSalary()) {
//			return 1;
//		} else if (this.getSalary() < e.getSalary()) {
//			return -1;
//		} else {
//			return 0;
//		}
	@Override
	public int compareTo(Emp e) {
		if(this.name.compareTo(e.name)>0) {
			return 1;
		}else if(this.name.compareTo(e.name)<0) {
			return -1;
		}else {
			return 0;
		}
		
//		return this.name.compareTo(e.name);
	}
}
public class ComparableEx {

	public static void main(String[] args) {
		List<Emp> pq=new ArrayList<Emp>();
		pq.add(new Emp("honey",100000));
		pq.add(new Emp("angel",10000));
		pq.add(new Emp("teju",50000));
		pq.add(new Emp("rocky",80000));
		pq.add(new Emp("liyanshi",40000));
		Collections.sort(pq);
		Collections.reverse(pq);
		for(Emp s:pq) {
			System.out.println(s);
		}
	}

}
