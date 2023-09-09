package assignment;
class Student{
	String name;
	int score;
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}
}
class Classroom{
	public String registerStudent(Student student) {
		
		if(!(student.name.matches(".*[A-Z].*"))) {
			return "Block letters needed";
		}
		if((student.score<0||student.score>100)) {
			return "Invalid score";
		}
		return "Registered";
	}
	public String studentCard(String card) {
		if(card.matches("\\d+")) {
			return "valid card";
		}else {
			return "Invalid card";
		}
	}
}
public class StudentCard {

	public static void main(String[] args) {
		Student s1=new Student("LEKHA",-90);
		Classroom cm=new Classroom();
		System.out.println(cm.registerStudent(s1));

	}

}
