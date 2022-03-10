package Day1;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program that prints out the list and count how many natural numbers are from A to B which are prime numbers and are palindrome (A<B)

public class P2 
{
	public static boolean isprime(long n)
	{
		if (n==1 || n==0)
			return false;
		for (long i=2;i<=Math.sqrt(n);i++)
			{
				if (n%i ==0)
					return false;
			}
		return true;
		
	}
	public static boolean ispalindrome(long n)
	{
		long a=n,s=0;
		while (n>0)
		{
			s=s*10+n%10;
			n=n/10;
		}
		if (s==a)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long A=sc.nextInt();
		long B=sc.nextInt();
		ArrayList <Object> list=new ArrayList<>();
		boolean v2=false;
		boolean v1=false;
		for (long i=A;i<=B;i++)
		{
			v1=isprime(i);
			if (v1==true)
				{
				 v2=ispalindrome(i);
				 if (v2==true)	{ list.add(i); }
				}
		}
		System.out.print("Prime and Palindrome : "+"\n"+list);
	}
}