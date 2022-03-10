package Day1;
/*Problem Statement: Given a value V, if we want to make a change for V Rs, and 
 * we have an infinite supply of each of the denominations in Indian currency, i.e., 
 * we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes,
 * what is the minimum number of coins and/or notes needed to make the change.
 * Example :
 * Example 1:
 * Input: V = 70
 * Output: 2
 * Explaination: We need a 50 Rs note and a 20 Rs note.
 * Example 2:
 * Input: V = 121
 * Output: 3
 * Explaination: We need a 100 Rs note, a 20 Rs note and a 1 Rs coin.
 * 
 * 
 */
import java.util.*;

public class FindMinimumNoOfCoins 
{
	
	public static void main(String[] args)
	{
		int []arr= {1,2,5,10,20,50,100,500,1000};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter change value you want to made : ");
		int V=sc.nextInt();
		
		Arrays.sort(arr);
		int i=arr.length-1,sum=0,count=0;
		while(i>=0)
		{
			if ( arr[i] <= V )
				{ count++;sum+=arr[i]; V=V-arr[i];}
			i--; 
		}
		System.out.println(count);
	}
}


//ANOTHER SOLUTION
/*
 * int V = 49;
    ArrayList < Integer > ans = new ArrayList < > ();
    int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    int n = coins.length;
    for (int i = n - 1; i >= 0; i--) {
      while (V >= coins[i]) {
        V -= coins[i];
        ans.add(coins[i]);
      }
    }
    System.out.println("The minimum number of coins is "+ans.size());
    System.out.println("The coins are ");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(" " + ans.get(i));
    }
*/
 
