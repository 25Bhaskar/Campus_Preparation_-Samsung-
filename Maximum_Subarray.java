package Day1;

import java.io.*;
import java.util.*;

// maximum sum of a subarray (non cyclic) 
public class Maximum_Subarray 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(Br.readLine());
		int [] A=new int[N];
		
		for (int i=0;i<N;i++)
		{
			A[i]=Integer.parseInt(Br.readLine());
		}
		
		long ans=-10000;//Min value
		long sum=0;
		for (int i=0;i<N;i++)
		{
			sum=(sum>0 ? sum : 0) + A[i];
			ans=Math.max(ans, sum);
		}
		System.out.println(ans);
		System.out.println(Arrays.binarySearch(A,7)); //it will return the index at which this 7 present in an array -> A 
	}
}
