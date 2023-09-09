package fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteInFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:/Users/chara/Desktop/Javaedubridge/ListOfCourses4.txt");
		String s="A File object is created by passing in a string that represents the name of a file, a String, or another File object.";
		byte[] b=s.getBytes();//converting string into byte array
		fos.write(b);
		fos.close();
		System.out.println("Content Written Successfully");
		FileInputStream fis=new FileInputStream("C:/Users/chara/Desktop/Javaedubridge/ListOfCourses4.txt");
		System.out.println("File Content...");
		int i=fis.read();
		System.out.println((char)i);
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		
       fis.close(); 
	}

}
