package Day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class gridproblem 
{
	public static int  ways(int cr, int cc, int n, int m, int [][]arr, int brr,ArrayList crr)
	{
		
		
		if ((cr == n) && (cc == m)) { System.out.println(brr);crr.add(brr); return 1; }
		if ((cr > n)||(cc > m)) { return 0; }
		
		int count1=ways(cr,cc+1,n,m,arr,brr+arr[cr][cc],crr); //Right movement
		int count2=ways(cr+1,cc,n,m,arr,brr+arr[cr][cc],crr); //Downward movement
		
		// Collections.sort(crr);
		// System.out.println(crr.get(0));
		
		return count1+count2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader Br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter Rows & Column : ");
		
		//'n' and 'm' can be different also means it is not restricted to square matrix only 
		int n=Integer.parseInt(Br.readLine());
		int m=Integer.parseInt(Br.readLine());
		
		int arr[][]=new int[n][m];  // Creating an array to store values
		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<m;j++) 
			{
				arr[i][j]=Integer.parseInt(Br.readLine());
			}
		}	
		ArrayList <Integer> crr=new ArrayList<>();
		int w=ways(0,0,n-1,m-1,arr,0,crr); // "ways" is a method name : 0,0 stands for current row and current column and 3,3 stands for total rows and column
		System.out.println("Number of ways : "+w);
	}
}
