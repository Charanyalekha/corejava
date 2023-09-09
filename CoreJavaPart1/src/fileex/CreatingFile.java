package fileex;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		File newFile = new File("C:/Users/chara/Desktop/Javaedubridge/ListOfCourses4.txt");//absolute
		//File newFile=new File("test12.txt");
		System.out.println("Absolute path"+newFile.getAbsolutePath());
		File newFile1 = new File("ListOfCourses2.txt");//relative
		System.out.println("Relative path "+newFile1.getCanonicalPath());
		System.out.println("Absolute Path "+newFile1.getAbsolutePath());
		System.out.println("RW :"+newFile.canRead());
		System.out.println("Read Write :"+newFile.canWrite());
		System.out.println("File Name :"+newFile.getName());
		System.out.println("Size of the file :"+newFile.length());
		System.out.println(newFile.getParent());
		File newFileF2 = new File("C:/Users/chara/Desktop/Javaedubridge"); //relative"
		String[] list = newFileF2.list();
		System.out.println("List of files :"+list.length);
		for(int i =0;i<list.length;i++) {
		System.out.println(list[i]);
		}
		
		if (newFile.createNewFile()) {
			System.out.println("File created.");
		} else {
			System.out.println("File exists.");
		}

	}

}
