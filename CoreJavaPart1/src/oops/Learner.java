package oops;

public class Learner {
	int lid;
	String lname;
	String degree;

	public Learner() {
		lid = 10148;
		lname = "Lekha";
		degree = "MCA";
		System.out.println("learner id :" + lid);
		System.out.println("learner name :" + lname);
		System.out.println("learner degree :" + degree);
	}

	Learner(int lid, String lname, String degree) {
		this.lid = lid;
		this.lname = lname;
		this.degree = degree;
		System.out.println("learner id :" + lid);
		System.out.println("learner name :" + lname);
		System.out.println("learner degree :" + degree);
	}

	Learner(Learner c1) {
		lid = c1.lid;
		lname = c1.lname;
		degree = c1.degree;
		System.out.println("learner id :" + lid);
		System.out.println("learner name :" + lname);
		System.out.println("learner degree :" + degree);
	}

	public static void main(String[] args) {
		Learner c = new Learner();
		Learner c1 = new Learner(10110, "Charanya", "MCA");
		Learner c2 = new Learner(c1);

	}

}
