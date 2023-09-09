package fileex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("pwfile.txt");
		pw.printf("Hey there! this is %S.\n", "Charanya");// printf(String str,object arguments)//used to print
															// formatted string.it includes both text and data and the
															// arguments replace the data inside the formatted string.
		pw.print("Today you're exploring the printWriter class.");// print(String str)this method will printthe string
																	// passed to it using printwriter object.
		pw.println("Hope you're having fun.");// a line break is printed after the string contents.
		pw.append("Patience is the key when learning new concepts.");// the character sequence passed to the append is
																		// added to the printwriter object.
		pw.flush();// empties the content of the printwriter object.
		pw.close();// closes the writing stream and frees any allocated resources.
//		FileReader fr=new FileReader("pwfile.txt");
//		int i;
//		while((i=fr.read())!=-1) {
//			System.out.print((char)i);
//			i=fr.read();
//		}
//		fr.close();
		BufferedReader br=new BufferedReader(new FileReader("pwfile.txt"));
		String str=br.readLine();
		while(str!=null) {
			System.out.print(str);
			str=br.readLine();
		}
		br.close();

	}

}
