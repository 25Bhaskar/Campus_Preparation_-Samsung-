package Day1;
import java.util.*;

public class FractionalKnapsack 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> values=new ArrayList<>();
		ArrayList<Integer> weight=new ArrayList<>();
		ArrayList<Integer> v_w_ratio=new ArrayList<>();
		
		int n=3; 
		int W=50;
		// user input of number of values or weight
		// use Scanner to take input from user
		values.add(60);weight.add(10);
		values.add(100);weight.add(20);
		values.add(120);weight.add(30);
		for(int i=0;i<n;i++)
		{
			v_w_ratio.add(values.get(i)/weight.get(i));
			System.out.println(" ");
			System.out.print(values.get(i)+" "+weight.get(i)+" - > "+v_w_ratio.get(i));
		}
		//sort ratio in dec order
		Collections.sort(v_w_ratio,(a,b)-> { return (a<b) ? 1:-1;});
		System.out.println(v_w_ratio);
	}

}
