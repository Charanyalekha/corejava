package basic;
class Book
{
	//non-static / instance variable
	private  long id;
	private String name;
	private double price;	
	
	//static variable
	static String libraryName="Smart City Library";

	public Book(long id, String name, double price) {
	
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	void display()
	{
		System.out.println(this.id + " "+this.name+" "+this.price +" "+this.libraryName);
	}
	
}
public class InstanceVsStaticVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Book book1=new Book(123, "Programming in Java", 900);
				book1.display();
				Book book2=new Book(876, "Programming in Python", 700);
				Book.libraryName="Modern City Library";
				book2.display();
				Book book3=new Book(123, "Programming in C#", 800);
				book3.display();
				
				

			}

		}
