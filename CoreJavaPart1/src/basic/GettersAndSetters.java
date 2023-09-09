package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GettersAndSetters {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		String name=bf.readLine();
		int age=Integer.parseInt(bf.readLine());
		Student s=new Student();
		s.name=name;
		s.setAge(age);
		System.out.println(" Name :"+s.name);
		System.out.println(" Age :"+s.getAge());
	}

}
class Student{
	public String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("Invalid age");
			this.age=0;
		}
		else
			this.age=age;
	}
}
