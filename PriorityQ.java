package Day1;

import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue <Integer> PQ=new PriorityQueue<>();
		PQ.offer(10);
		PQ.offer(2);
		PQ.offer(9);
		PQ.offer(20);
		
		System.out.println(PQ.peek());// it will always return a minimum value from the data elements we entered in a Priority queue
		PQ.poll();// remove minimum element from the queue (highest priority)
		System.out.println(PQ);// print in sorted order also
		int size=PQ.size();
		System.out.println(size);//return present size of queue
	
		PQ.poll();//deleting elements (highest priority -> minimum valued element) 
		System.out.println(PQ);
		PQ.poll();
		PQ.poll();
		System.out.println(PQ);// ALL ELEMENTS ARE DELETED
		boolean i=PQ.isEmpty();//return true if the Queue is empty
	System.out.println(i); //it will return true
		
	}

}
