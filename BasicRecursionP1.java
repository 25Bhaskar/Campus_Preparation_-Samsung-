package Day1;

import java.util.Scanner;

//Permutation given n and r -> nPr
public class BasicRecursionP1 
{

	static int fact(int n)
	{
		if (n==1 || n==0)
			return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.println(fact(n)/fact(n-r));		
	}

}
