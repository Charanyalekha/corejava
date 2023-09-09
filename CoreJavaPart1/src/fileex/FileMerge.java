package fileex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

	public static void main(String[] args) throws IOException {

		File file3 = new File("C:/Users/chara/Desktop/Javaedubridge/file3.txt");
		FileWriter fw = new FileWriter("C:/Users/chara/Desktop/Javaedubridge/file3.txt");
		fw.write(
				"Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.");
		fw.close();
		File file4 = new File("C:/Users/chara/Desktop/Javaedubridge/file4.txt");
		FileWriter fw1 = new FileWriter("C:/Users/chara/Desktop/Javaedubridge/file4.txt");
		fw1.write(
				"We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class. For Comparator, client needs to provide the Comparator class to use in compare() method.");
        fw1.close();
        //printWriter is a class used to write any form of data(int,float,double,string,or object in the form of text either in a console or in a file in java.
        PrintWriter pw=new PrintWriter("C:/Users/chara/Desktop/Javaedubridge/file5.txt");
        BufferedReader br1=new BufferedReader(new FileReader("C:/Users/chara/Desktop/Javaedubridge/file3.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("C:/Users/chara/Desktop/Javaedubridge/file4.txt"));
        String str1=br1.readLine();
        String str2=br2.readLine();
        while(str1!=null ||str2!=null){
        	if(str1!=null) {
        		pw.println(str1);
        		str1=br1.readLine();
        	}
        	if(str2!=null) {
        		pw.println(str2);
        		str2=br2.readLine();
        	}
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
        
	}

}
