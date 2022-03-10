//Basic Implementation Training 
package Day1;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program to print out Prime numbers between A and B
public class P1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		ArrayList <Integer> Prime=new ArrayList<>();
		int flag=0;
		for (int i=A;i<=B;i++)
		{
			if (i==1)
				continue;
			else {
			for (int j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag=1;
				}
				else
					flag=0;
			}
			}
			if (flag==0)
				Prime.add(i);
		}
		System.out.print("Prime numbers :"+"\n"+Prime);	
	}
		
}


