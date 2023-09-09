package oops;

public class ThisMethod {
	int rno;
	String name;
	int marks;
	public ThisMethod(int rno) {
		this.rno=rno;
	}
	public ThisMethod(int rno,String name,int marks) {
		this(rno);
		this.name=name;
		this.marks=marks;
		System.out.println(" Student rno :"+rno+" Student Name :"+name+" Student marks :"+marks);
	}

	public static void main(String[] args) {
		ThisMethod m=new ThisMethod(10,"Charanya", 98);
	
	}

}
