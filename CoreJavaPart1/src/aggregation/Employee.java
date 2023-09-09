package aggregation;

public class Employee {
	private Job j;

	public Employee() {
		this.j = new Job();
		j.setSalary(20000);
		j.setDesignation("Developer");

	}

	int getSalary() {
		return j.getSalary();
	}

	String getDesignation() {
		return j.getDesignation();
	}
}
