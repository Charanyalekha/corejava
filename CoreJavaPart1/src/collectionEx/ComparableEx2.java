package collectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employeee implements Comparable<Employeee> {
	String name;
	int salary;

	public Employeee(String name, int salary) {
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
	public int compareTo(Employeee e) {

		return this.name.compareTo(e.getName());
	}

}

public class ComparableEx2 {

	public static void main(String[] args) {
		List<Employeee> employees = new ArrayList<>(Arrays.asList(
				new Employeee("kapil", 2000),
                new Employeee("amit", 1500),
                new Employeee("dilip", 1000),
                new Employeee("bipasha", 45000)
            ));
		Collections.sort(employees);
		Collections.reverse(employees);
        for (Employeee e : employees) {
        	System.out.println(e.getName() + " => " + e.getSalary());
        }


	}

}
