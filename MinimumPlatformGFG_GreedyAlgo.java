package Day1;
import java.util.*;
//GeekforGeeks: Question:
/*
 * Given arrival and departure times of all trains that reach a railway station
 * Find the minimum number of platforms required for the railway station
 * so that no train is kept waiting.
 * Consider that all the trains arrive on the same day and leave on the same day. Arrival and 
 * departure times can never be the same for a train but we can have arrival time of one train equal to departure time of the other . 
 * At any given instance of time, same platform can not be used for both
 * departure of a train and arrival of another train . In such cases, we need different platforms.
 */

public class MinimumPlatformGFG_GreedyAlgo 
{
	public static int minimumplatform(int[] arv,int []dep, int n)
	{
		Arrays.sort(arv);
		Arrays.sort(dep);
		
		int i=1,j=0; //arrival mat pointer and departure mat pointer
		int mp=0; 
		int pf=1;    
		
		while(i<n && j<n)
		{
			if (arv[i]>dep[j])
				{ pf--; j++;  }
			else if (arv[i]<=dep[j])
			{ pf++; i++;}
			if (pf>=mp)
				mp=pf;
		}
		return mp;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []arv= {900,940,950,1100,1500,1800};
		int []dep= {910,1200,1120,1130,1900,2000};
		int n=arv.length;
		int mp=minimumplatform(arv,dep,n);
		System.out.println("minimum platform required : "+mp);
	}

}
