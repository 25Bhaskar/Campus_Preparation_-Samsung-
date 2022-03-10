package Day1;
import java.util.*;

/*
 * Question :
 * Divide an area into zones as follows, and assign one person to each zone to do a treasure hunt.
The person assigned to each zone can find one treasure each, and the range to find treasures is determined according to the number
of the assigned zone. The person assigned to zone 1 can search zones 1,2,3,4, and 5, the person assigned to zone 2 can search in zones 2,3,4,and 5 and
the person assigned to zone 3 can search in zones 3,4, and 5. In other words, it is possible to search the zones with numbers larger than the number of his or her zone, 
along with that assigned zone.

zone number 
1	3000 (Treasure price)
2	8000 4000 5000 1000
3	2000 6000
4	2500
5	7000 5500

When treasures are hidden in the zones as above, if the person in zone 1 finds a 3000 won treasure, the person in zone 2 finds a 8000-won treasure, 
the person in zone 3 finds a 6000 won treasure, the person in zone 4 finds a 2500-won treasure, and the person in zone 5 finds a 7000-won treasure, 
the total amount of treasures found will be 26500 won. However, if the person in zone 1 finds 5000 won treasure, the person in zone 2 finds 8000-won treasure, 
the person in zone 3 finds 6000-won treasure, the person in zone 4 finds 5500-won treasure and the person in zone 5 finds 7000-won treasure, 
the total amount is 31500 won.

Given the number of zones N and the price information of the hidder treasures in each zone,make a program that outputs the total amount of treasures at 
the time when the total amount of treasures found by N people is the maximum

[Input]
First the number of the test cases T is given and T test cases are given starting from the next line. Each test case consistes of several lines, and 
N (5<N<6000) is given on the first line. On the next N*2 lines, the price information of the hiddden treasures is given
from zone 1 to zone N. Each zone consists of two lines, and the number of hidden treasures M (1<= M <= 60) is given on the first line, and 
the price information of the M treasures is give on the next line, separated by spaces. However the prices of treasures range from 1000 to 100000 and 
duplicate values may be given.

[Output]
For each test case, output"#x" (where x means that test case number) leaves a space, and then output the maximum amount of N treasures.

Example:

4 	<-T (Test Cases)
5 	<-N (Zones)
1 	<-number of values in zone 1
3000
4 	<-number of values in zone 2
8000 4000 5000 1000
2 	<-number of values in zone 3
2000 6000
1 	<-number of values in zone 4
2500
2   <-number of values in zone 5
7000 5500

[output]
31500
 * 
 */
public class TreasureHuntProblem 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(); // Test Cases
		
		ArrayList <Integer> Flist=new ArrayList<>(); // Stores final answer
		for (int t=1;t<=T;t++) 
		{		
		int N=sc.nextInt(); // Total Zones
		
		ArrayList <ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		
		for (int i=0;i<N;i++) 
		{   
			arr.add(new ArrayList<Integer>());
			int zone=sc.nextInt();
			for (int j=0;j<zone;j++) { arr.get(i).add(sc.nextInt()); }
			Collections.sort(arr.get(i),(a,b)-> { return (a>b) ?-1:1; });
		}
	
		int sum=0;	
		
		ArrayList <Integer> brr=new ArrayList<>();
		brr.addAll(arr.get(N-1));
	
		for (int i=N-2;i>=0;i--)
		{ 
			sum+=brr.get(0); 
			brr.remove(brr.get(0));
			brr.addAll(arr.get(i));
			Collections.sort(brr,(a,b)-> { return (a>b) ?-1:1; });
		}
		sum+=brr.get(0);
		Flist.add(sum);
		}
		
		// Output Printing
		for (int i=1;i<=T;i++)
		{
			System.out.println("# "+i+" "+Flist.get(i-1));
		}
	}
}
