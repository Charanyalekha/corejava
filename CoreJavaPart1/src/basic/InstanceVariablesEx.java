package basic;

public class InstanceVariablesEx {
	int empNo;
    String empName;
	int empAge;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       InstanceVariablesEx emp1=new InstanceVariablesEx();
       emp1.empNo=10;
       emp1.empName="Arjun";
       emp1.empAge=25;
       System.out.println(" Employee number : "+emp1.empNo);
       System.out.println(" Employee Name: " +emp1.empName);
       System.out.println(" Employee Age: "+emp1.empAge);
       InstanceVariablesEx emp2=new InstanceVariablesEx();
       emp2.empNo=20;
       emp2.empName="Kamala";
       emp2.empAge=28;
       System.out.println(" Employee number : "+emp2.empNo);
       System.out.println(" Employee Name: " +emp2.empName);
       System.out.println(" Employee Age: "+emp2.empAge);
       InstanceVariablesEx emp3=new InstanceVariablesEx();
       emp3.empNo=30;
       emp3.empName="Nikhil";
       emp3.empAge=22;
       System.out.println(" Employee number : "+emp3.empNo);
       System.out.println(" Employee Name: " +emp3.empName);
       System.out.println(" Employee Age: "+emp3.empAge);
       
	}

}
