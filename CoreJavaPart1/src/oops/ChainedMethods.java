package oops;
class Studentt{
	int id;
	String name;
	public Studentt setId(int id) {
		this.id=id;
		return this;
	}
	public Studentt setName(String name) {
		this.name=name;
		return this;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class ChainedMethods {

	public static void main(String[] args) {
      Studentt s=new Studentt();
      s.setId(25).setName("Charanya").display();
	}

}
