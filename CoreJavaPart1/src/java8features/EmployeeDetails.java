package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	int eid;
	String ename;
	String designation;
	int salary;
    public Employee(int eid,String ename,String designation,int salary) {
		this.eid=eid;
		this.ename=ename;
		this.designation=designation;
		this.salary=salary;
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}
    
}
public class EmployeeDetails {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1000,"Koushal","TL",55000));
		list.add(new Employee(2000,"Karthik","HR",35000));
		list.add(new Employee(3000,"Ankit","Manager",75000));
		list.add(new Employee(4000,"Prerana","TRAINER",40000));
		list.add(new Employee(5000,"Priyanshi","DEVELOPER",65000));
		list.add(new Employee(2000,"Karthik","HR",35000));
		System.out.println(list);
		List<String> li=list.stream().map(e->e.toString()).collect(Collectors.toList());
		System.out.println(" Employees in the given list :"+li);
		Set<String> s=list.stream().map(e->e.toString()).collect(Collectors.toSet());
		System.out.println(" Employees in the given list :"+s);
		long count=list.stream().count();
		System.out.println(count);
		long c=list.stream().filter(e->e.getEname().startsWith("A")).count();
		System.out.println(c);
		Stream<Employee> nameStartsWith=list.stream().filter(e->e.getEname().startsWith("K"));
		System.out.println(" Names Starts with K :"+nameStartsWith.collect(Collectors.toList()));
		Object s1 = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));
		System.out.println("Emp maximum salary:" + s1);
		Object s2 = list.stream().collect(Collectors.minBy(Comparator.comparingInt(w -> w.salary)));
		System.out.println("Emp minimum salary:" + s2);
		Object s3 = list.stream().collect(Collectors.averagingInt((w -> w.salary)));
		System.out.println("Emp average salary:" + s3);
		//sort employee by name
		Object s4 = list.stream().sorted((e1,e2)->e1.getEname().compareTo(e2.getEname())).collect(Collectors.toList());
		System.out.println("Emp list sorted according to name :" + s4);
		//sort list by designation
		Object s5 = list.stream().sorted((e1,e2)->e1.getDesignation().compareTo(e2.getDesignation())).collect(Collectors.toList());
		System.out.println("Emp list sorted according to designation :" + s5);
		//printing emp names
		List<String> namesofemp = list.stream() 
                .map(n->n.ename) 
                .collect(Collectors.toList());
        System.out.println(namesofemp);
        //printing emp names in uppercase
        List<String> namesofemp1 = list.stream() 
                .map(n->n.ename.toUpperCase()) 
                .collect(Collectors.toList());
        System.out.println(namesofemp1);
        //print distinct designations....
        list.stream().map(Employee::getDesignation).distinct() .forEach(System.out::println);
        Object s6 = list.stream().collect(Collectors.summingInt((w -> w.salary)));
		System.out.println("sum of the salary:"+s6);
		int a[] = { 1, 5, 8 ,34,3};
		long count1= Arrays.stream(a).sum();
		System.out.println("Sum:"+count1);
	}

}
