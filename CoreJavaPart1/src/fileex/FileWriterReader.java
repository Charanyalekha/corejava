package fileex;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:/Users/chara/Desktop/Javaedubridge/ListOfCourses4.txt");
		fw.write(" Hello all......");
		fw.write("File Handling in Java");
		fw.write(" Using Character Stream");
		System.out.println("Content Written Successfully....");
        fw.close();
        FileReader fr=new FileReader("C:/Users/chara/Desktop/Javaedubridge/ListOfCourses4.txt");
        int t;
        while((t=fr.read())!=-1) {
        	System.out.print((char)t);
        }
        fr.close();
	}

}
