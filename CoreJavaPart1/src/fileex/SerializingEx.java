package fileex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Link implements Serializable{
	String commons;
	int favourites;
	public Link(String commons,int favourites) {
		this.commons=commons;
		this.favourites=favourites;
	}
	public void printLink() {
		System.out.println("Link :"+commons);
	}
}

public class SerializingEx {
	public static  void serializeLink(Link link1,String filename) throws IOException {
		FileOutputStream fos=new FileOutputStream(filename);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(link1);
		oos.close();
		fos.close();
	}
	public static Link deSerializeLink(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream(filename);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Link link1;
		link1=(Link)ois.readObject();
		return link1;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Link link1=new Link("My First Link",5);
		final String filename="link1.txt";
		System.out.println("Before Serialization :");
		link1.printLink();
		serializeLink(link1, filename);
		Link newLink=deSerializeLink(filename);
		System.out.println("After Serialization :");
		newLink.printLink();

	}

}
