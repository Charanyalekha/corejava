package fileex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee1 e1=new Employee1();
		e1.empName="John";
		e1.empNo=2345;
		Employee1 e2=new Employee1();
		e2.empName="Sujith";
		e2.empNo=3478;
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close();
		fos.close();
		System.out.println("Data Saved");

	}

}
