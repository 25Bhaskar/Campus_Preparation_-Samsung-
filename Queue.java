package Day1;

import java.util.*;
import java.util.Deque;

public class Queue {

	public static void main(String[] args) {
		Deque <Integer> q=new ArrayDeque <>();
		q.offer(1);//add
		q.offer(2);
		q.offer(3);
		System.out.println(q);
		q.poll();//delete and return deleted element from queue
		int a=q.peek();//return element present at front end (insertion end)
		System.out.println(q+" "+a);
		
		//sequentially print queue values
		while(!q.isEmpty())
			System.out.print(q.poll()+" ");	

	}

}
