package Day1;
import java.util.*;
class Graph1
{
	ArrayList <ArrayList<Integer>> graph;
	int v;
	
	Graph1(int node) //provides the total number of node v=5 (say)
	{
		v=node;
		graph=new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	
 void addEdge(int v, int u)
	{
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	
 void show()
	{
		for (int i=0;i<v;i++) 
		{
			System.out.print("Node: "+i);
			for (int x : graph.get(i))
			{
				System.out.print(" -> "+x+" ");
				
			}
			System.out.println(" ");
		}
	}

	
}

public class Graph 
{
	public static void main(String[] args) 
	{
		Graph1 g=new Graph1(5);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 1);
		g.addEdge(2, 4);
		g.addEdge(3, 2);
		g.show();	
	}
}
