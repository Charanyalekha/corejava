package collectionEx;

import java.util.HashSet;

class Department {
	int dId;
	String dName;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Department> set = new HashSet<>();
		Department d1 = new Department();
		d1.setdId(1000);
		d1.setdName("IT");
		Department d2 = new Department();
		d2.setdId(2000);
		d2.setdName("Marketing");
		set.add(d1);
		set.add(d2);
		for (Department d : set) {
			System.out.println("Department ID :" + d.getdId());
			System.out.println("Deppartment Name :" + d.getdName());
		}


	}

}
