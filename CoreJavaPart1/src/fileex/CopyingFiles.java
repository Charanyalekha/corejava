package fileex;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingFiles {

	public static void main(String[] args) throws IOException {
		File file1=new File("C:/Users/chara/Desktop/Javaedubridge/file1.txt");
		FileWriter fw1=new FileWriter("C:/Users/chara/Desktop/Javaedubridge/file1.txt");
		fw1.write("Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting." );
		fw1.close();
		File file2=new File("C:\\Users\\chara\\Desktop\\Javaedubridge\file2.txt");
		//to copy content of one file into another......
		FileReader fr1=new FileReader("C:/Users/chara/Desktop/Javaedubridge/file1.txt");
		FileWriter fw2=new FileWriter("C:/Users/chara/Desktop/Javaedubridge/file2.txt");
		int i;
		while((i=fr1.read())!=-1) {
			fw2.write((char)i);
		}
		fw2.close();
		fr1.close();
		System.out.println("Content copied successfully....");
		FileReader fr2=new FileReader("C:/Users/chara/Desktop/Javaedubridge/file2.txt");
		int j;
		while((j=fr2.read())!=-1) {
			System.out.print((char)j);
		}
		fr2.close();

	}

}
