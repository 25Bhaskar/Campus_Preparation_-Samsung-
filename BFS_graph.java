package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Graph_class
{
	int v;
	LinkedList<Integer> g[];
    Graph_class(int v)
     {	
		g=new LinkedList[v];
		for (int i=0;i<v;i++)
		g[i]=new LinkedList<Integer>(); 
		
	}
	void addedge(int e,int f)
	{
		g[e].add(f);
		g[f].add(e);
		
	}
	void show(int v)
	{
		for (int i=0;i<v;i++)
		{
			System.out.println("Node: "+i+" -> "+g[i]);
		}
	}
	
	void BreadthFirstSearch(int s,int d)
	{
		int p[]=new int[g.length];
		boolean vis[]=new boolean[g.length];
		Deque <Integer> q=new ArrayDeque <>();
		
		p[s]=-1;
		q.offer(s);
		vis[s]=true;
		
		while (!q.isEmpty())
		{
			int curr=q.poll();
			if (curr==d) break;
			for (int i:g[curr])
			{
				if (!vis[i])
					{ q.offer(i); vis[i]=true; p[i]=curr; }
			}
		}
		int i=d;
		int dis=0;
		while (p[i] !=-1)
		{
			i=p[i];
			++dis;
		}
		System.out.println(" Minimum Distance : "+dis);
	}
}


public class BFS_graph
{
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{	
		BufferedReader str=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the vertex count and Edges of the graph :");
		int vertex=Integer.parseInt(str.readLine());
		int edges=Integer.parseInt(str.readLine());
		
		Graph_class g=new Graph_class(vertex);
	
		System.out.println("Enter vertex 1 -> vertex 2 :");
		for (int i=0;i<edges;i++)
		{
			int a=Integer.parseInt(str.readLine());
			int b=Integer.parseInt(str.readLine());
			g.addedge(a,b);
		}
		
		g.show(vertex);
		System.out.println("Enter source and destination vertex :");
		int s=Integer.parseInt(str.readLine());
		int d=Integer.parseInt(str.readLine());
		g.BreadthFirstSearch(s, d);
	}

}
