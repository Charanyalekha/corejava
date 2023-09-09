package assignment;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

class Employeee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;
	public Employeee(int id,String name,int age,String gender,String department,int yearOfJoining,double salary) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.department=department;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
}

public class EmployeeManagement {

	public static void main(String[] args) {
          ArrayList<Employeee> list=new ArrayList<>();
          list.add(new Employeee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
          list.add(new Employeee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
          list.add(new Employeee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
          list.add(new Employeee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
          list.add(new Employeee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
          list.add(new Employeee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
          list.add(new Employeee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
          list.add(new Employeee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
          list.add(new Employeee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
          list.add(new Employeee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
          list.add(new Employeee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
          list.add(new Employeee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
          list.add(new Employeee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
          list.add(new Employeee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
          list.add(new Employeee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
          list.add(new Employeee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
          list.add(new Employeee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
          //1.to print no. of male and female employees....
          Map<String, Long> map1= list.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.counting()));
          System.out.println(map1);
          //2. to print distinct departments.....
          list.stream().map(Employeee::getDepartment).distinct().forEach(System.out::println);
          //3. to print avg age of male and female employees...
          Map<String,Double> map2=list.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.averagingInt(Employeee::getAge)));
          System.out.println(map2);
          //4.details of highest paid employeee.....
          Optional<Employeee> s=list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employeee::getSalary)));
          System.out.println("Highest Paid Employee Details : "+s);
          Employeee highestPaidEmployee =  s.get();
          System.out.println("Details Of Highest Paid Employee : "); 
          System.out.println("==================================");   
          System.out.println("ID : "+highestPaidEmployee.getId());        
          System.out.println("Name : "+highestPaidEmployee.getName());       
          System.out.println("Age : "+highestPaidEmployee.getAge());       
          System.out.println("Gender : "+highestPaidEmployee.getGender());       
          System.out.println("Department : "+highestPaidEmployee.getDepartment());        
          System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());       
          System.out.println("Salary : "+highestPaidEmployee.getSalary());
          //5.Get the names of all employees who have joined after 2015
          System.out.println("==================================");  
          list.stream().filter(e->e.getYearOfJoining()>2015).map(Employeee::getName).forEach(System.out::println);
          //6.Count the number of employees in each department
          System.out.println("==================================");  
          Map<String,Long> map3=list.stream().collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.counting()));
          Set<String> keys = map3.keySet();
  		  for (String key : keys) {
  		  System.out.println(key + " " + map3.get(key));
  		  }
  		  //7.What is the average salary of each department
  		  System.out.println("==================================");  
  		  Map<String,Double> map4=list.stream().collect(Collectors.groupingBy(Employeee::getDepartment,Collectors.averagingDouble(Employeee::getSalary)));
  		  Set<String> keys1 = map4.keySet();
		  for (String key : keys1) {
		  System.out.println(key + " " + map4.get(key));
		  }
		  //8.Get the details of youngest male employee in the product development department
		  Optional<Employeee> s1= list.stream().filter(e->e.getDepartment()=="Product Development").collect(Collectors.minBy(Comparator.comparingInt(Employeee::getAge)));
		  Employeee youngestEmployeee =  s1.get();
          System.out.println("Details Of Youngest Employee : "); 
          System.out.println("==================================");   
          System.out.println("ID : "+youngestEmployeee.getId());        
          System.out.println("Name : "+youngestEmployeee.getName());       
          System.out.println("Age : "+youngestEmployeee.getAge());       
          System.out.println("Gender : "+youngestEmployeee.getGender());       
          System.out.println("Department : "+youngestEmployeee.getDepartment());        
          System.out.println("Year Of Joining : "+youngestEmployeee.getYearOfJoining());       
          System.out.println("Salary : "+youngestEmployeee.getSalary());
          //9.Who has the most working experience in the organization
          Optional<Employeee> s2=list.stream().sorted(Comparator.comparingInt(Employeee::getYearOfJoining)).findFirst();
          Employeee experiencedEmployeee =  s2.get();
          System.out.println("Details Of Experienced Employee : "); 
          System.out.println("==================================");   
          System.out.println("ID : "+experiencedEmployeee.getId());        
          System.out.println("Name : "+experiencedEmployeee.getName());       
          System.out.println("Age : "+experiencedEmployeee.getAge());       
          System.out.println("Gender : "+experiencedEmployeee.getGender());       
          System.out.println("Department : "+experiencedEmployeee.getDepartment());        
          System.out.println("Year Of Joining : "+experiencedEmployeee.getYearOfJoining());       
          System.out.println("Salary : "+experiencedEmployeee.getSalary());
          //10.How many male and female employees are there in the sales and marketing team....
          Map<String,Long> map5=list.stream().filter(e->e.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employeee::getGender,Collectors.counting()));
          System.out.println(map5);
          //11.What is the average salary of male and female employees...
          Map<String,Double> map6=list.stream().collect(Collectors.groupingBy(Employeee::getGender,Collectors.averagingDouble(Employeee::getSalary)));
          System.out.println(map6);
          //12.List down the names of all employees in each department
          Map<String, List<Employeee>> map7=list.stream().collect(Collectors.groupingBy(Employeee::getDepartment));
          Set<java.util.Map.Entry<String, List<Employeee>>> entrySet = map7.entrySet();
          
          for (java.util.Map.Entry<String, List<Employeee>> entry : entrySet) 
          {
              System.out.println("--------------------------------------");
                       
              System.out.println("Employees In "+entry.getKey() + " : ");
                       
              System.out.println("--------------------------------------");
                       
              List<Employeee> list1 = entry.getValue();
                       
              for (Employeee e : list1) 
              {
                  System.out.println(e.getName());
              }
          }
          //13.What is the average salary and total salary of the whole organization....
          double avgSalary=list.stream().collect(Collectors.averagingDouble(Employeee::getSalary));
          System.out.println(" Average salary : "+avgSalary);
          double totalSalary=list.stream().collect(Collectors.summingDouble(Employeee::getSalary));
          System.out.println("Total Salary : "+totalSalary);
          //14.Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years....
          Map<Boolean, List<Employeee>> partitionEmployeesByAge=
        		  list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        		           
        		  Set<java.util.Map.Entry<Boolean, List<Employeee>>> entrySet1 = partitionEmployeesByAge.entrySet();
        		           
        		  for (java.util.Map.Entry<Boolean, List<Employeee>> entry : entrySet1) 
        		  {
        		      System.out.println("----------------------------");
        		               
        		      if (entry.getKey()) 
        		      {
        		          System.out.println("Employees older than 25 years :");
        		      }
        		      else
        		      {
        		          System.out.println("Employees younger than or equal to 25 years :");
        		      }
        		               
        		      System.out.println("----------------------------");
        		               
        		      List<Employeee> list2= entry.getValue();
        		               
        		      for (Employeee e : list2) 
        		      {
        		          System.out.println(e.getName());
        		      }
        		  }
         //15. Who is the oldest employee in the organization? What is his age and which department he belongs to.....
        		  System.out.println("----------------------------");
        		  Optional<Employeee> s4 = list.stream().max(Comparator.comparingInt(Employeee::getAge));
        	         
        		  Employeee oldestEmployee = s4.get();
        		           
        		  System.out.println("Name : "+oldestEmployee.getName());
        		           
        		  System.out.println("Age : "+oldestEmployee.getAge());
        		           
        		  System.out.println("Department : "+oldestEmployee.getDepartment());		  
	}    

}
