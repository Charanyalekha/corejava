package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	public static Iterator func(ArrayList myList) {
		Iterator it=myList.iterator();
		while(it.hasNext()) {
			Object element=it.next();
			if(element instanceof String) {
				break;
			}
		}
		return it;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList myList=new ArrayList();
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			myList.add(Integer.parseInt(br.readLine()));
		}
		myList.add("###");
		for(int i=0;i<m;i++) {
			myList.add(br.readLine());
		}
		Iterator it=func(myList);
		while(it.hasNext()) {
			Object element=it.next();
			System.out.println((String)element);
		}
		

	}

}
