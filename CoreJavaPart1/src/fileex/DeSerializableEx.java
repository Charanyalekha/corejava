package fileex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee1 e1,e2=null;
		FileInputStream fis=new FileInputStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		e1=(Employee1)ois.readObject();
		e2=(Employee1)ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Employee name :"+e1.empName);
		System.out.println("Employee no :"+e1.empNo);
		System.out.println("Employee name :"+e2.empName);
		System.out.println("Employee name :"+e2.empNo);
		e1.display();
		e2.display();
		

	}

}
