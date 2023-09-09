package collectionEx;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		for(int i:s) {
			System.out.println(i);
		}
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		
		

	}

}
