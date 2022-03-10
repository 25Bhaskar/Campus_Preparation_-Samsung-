package Day1;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		//Stack <Integer> s=new Stack<>();
		Deque <Integer> st=new ArrayDeque<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.print(st);
		System.out.println(st.peek()); // i.e 4 :return top data
		
		st.pop();
		
		
		while(!st.isEmpty())
		{
			System.out.print(st.pop()+" ");
		}
		
		
		

	}

}
