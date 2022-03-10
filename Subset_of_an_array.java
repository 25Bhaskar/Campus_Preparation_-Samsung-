package Day1;

import java.util.ArrayList;

//Print all the subset of an array using recursion
public class Subset_of_an_array 
{
	public static void subset(ArrayList<Integer> list,int idx,String s)
	{
		if (idx==list.size()) { System.out.print(s+" "); return ; }
		int cc=list.get(idx);
		subset(list,idx+1,s+cc);
		subset(list,idx+1,s);
		
		
		
	}
	public static void main(String[] args) 
	{	
		ArrayList <Integer> list=new ArrayList<>(); 
		 
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		subset(list,0," ");
		
	}
}
