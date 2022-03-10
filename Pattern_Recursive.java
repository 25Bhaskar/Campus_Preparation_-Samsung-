package Day1;
import java.io.*;

class Pattern_Recursive
{
	public static void pattern(int num, int i)
	{
		if (num==0)
			return ;
		for (int j=0;j<i;j++) { System.out.print(" * "); }
		System.out.println(" ");
	
		pattern(num-1,++i);	
	}
	public static void main (String[] args)
	{
		int n = 5;
		pattern(n, 1);
	}
}




