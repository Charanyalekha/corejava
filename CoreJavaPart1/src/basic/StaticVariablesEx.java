package basic;
class Emp1{
	static int empNo;
	static String empName;
	static int empAge;
}
public class StaticVariablesEx {
    static String empLocation;
	public static void main(String[] args) {
		
        Emp1.empNo=10;
        Emp1.empName="Arjun";
        Emp1.empAge=25;
        empLocation="Andhra Pradesh";
        System.out.println(" Employee number : "+Emp1.empNo);
        System.out.println(" Employee Name: " +Emp1.empName);
        System.out.println(" Employee Age: "+Emp1.empAge);
        System.out.println(" Employee Location: "+empLocation);
        
        
        
        
	}

}
