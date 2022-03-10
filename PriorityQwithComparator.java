package Day1;

import java.util.Comparator;
import java.util.PriorityQueue;

//As such for sorting in ascending order there is no need to use comparator , 
//Priority Queue itself provide the sorted results but in ascending order only.


class co implements Comparator <Integer>
{
	public int compare(Integer o1, Integer o2) 
	{
		if (o1<o2) // for decending order
			return 1;
		return -1;
	}
}

public class PriorityQwithComparator 
{
	public static void main(String[] args) 
	{
		co obj=new co();
		PriorityQueue <Integer> PQ=new PriorityQueue<Integer>();

		PQ.offer(2);
		PQ.offer(1);
		PQ.offer(3);
		PQ.offer(5);
		PQ.offer(4);
		PQ.offer(7);
		PQ.offer(6);
		while (!PQ.isEmpty())
			System.out.print(PQ.poll());
	}

}
