package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Write a program to print all values from 1 to n in a lexicographical order (Dictionary Order).
public class lexicographicalorder 
{
	public static void lexi(int x, int n)
	{
		if (x > n)
			return;
		
		if (x==n) {
			System.out.println(x);
			return;
		}
		
		if (x !=0){
			System.out.println(x);
		}
		
		for (int i = (x==0) ? 1:0 ; i<=9; i++)
			lexi(10*x+i,n);
		
	}
	
	public static void main(String [] args) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers (x,n): ");
		int x=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		
		System.out.println(x+" - to - "+n);
		lexi(x,n);				
	}
}