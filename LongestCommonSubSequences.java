package Day1;
import java.util.*;

public class LongestCommonSubSequences {

	public static void main(String[] args) 
	{
		String str="ABCD";
		String str1="ABC";
		
		
		int[][]dp=new int[str.length()+1][str1.length()+1];
		for (int i=dp.length-2;i>=0;i--) 
		{
			for (int j=dp[0].length-2;j>=0;j--) 
			{
				if (str.charAt(i)==str1.charAt(j)) 
					dp[i][j]=1+dp[i+1][j+1];
				else
					dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);	
			}
		}
		System.out.println("Largest common subsequence : "+ dp[0][0]);
		int size= (str.length() < str1.length() ) ? str.length() : str1.length();
		System.out.println("Shortest common subsequence : "+dp[size-1][size-1]);
		for (int i=0;i<dp.length;i++)
			{ for (int j=0;j<dp[0].length;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println(" ");
			}
	}
}

