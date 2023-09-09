package fileex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingFile {

	public static void main(String[] args) throws IOException {
		File file6=new File("C:\\Users\\chara\\Desktop\\Javaedubridge/file6.txt");
		FileWriter fw=new FileWriter("C:\\Users\\chara\\Desktop\\Javaedubridge/file6.txt");
        fw.write("hi how are you\n");
        fw.write("I am fine\n");
        fw.write("What about you?\n");
        fw.close();
        int charCount=0;
        int wordCount=0;
        int lineCount=0;
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\chara\\Desktop\\Javaedubridge/file6.txt"));
        String currLine=br.readLine();
        while(currLine!=null) {
        	lineCount++;
        	String words[]=currLine.split(" ");
        	wordCount=wordCount+words.length;
        	for(String word:words) {
        		charCount=charCount+word.length();
        	}
        	currLine=br.readLine();
        }
        System.out.println("Number of characters in the file :"+charCount);
        System.out.println("Number of words in the file :"+wordCount);
        System.out.println("Number of lines in the file :"+lineCount);
	}

}
