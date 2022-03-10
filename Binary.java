package Day1;

//Java program to Generate all binary string without
//consecutive 1's of size K
import java.util.*;
import java.lang.*;

public class Binary
{
	public static String toString(char[] ch) 
	{
		String str=new String(ch);
		return str;
	}
	
	public static void generate(int n, char[] ch,int k)
	{
		if (k==n) 
		{ 
			System.out.println(toString(ch)+" ");
			return ; 
		}
		
		if ( ch[k-1]=='0' )
		{
			ch[k]='0';
			generate(n,ch,k+1);
			ch[k]='1';
			generate(n,ch,k+1);
		}
		if ( ch[k-1]=='1')
		{
			ch[k]='0';
			generate(n,ch,k+1);
		}
	}
	
	public static void binary_fun(int n)
	{
		if (n <= 0) return;
	
		char [] ch=new char[n];
		ch[0]='0';
		generate(n,ch,1);
		ch[0]='1';
		generate(n,ch,1);
	}
	
	public static void main(String [] args)
	{
		int n=3;
		binary_fun(n);
	}
}
