package Day1;
import java.util.*;

public class SubSequencesOfAString 
{
	public static void subsequence(String str,String nstr, int idx)
	{
		if (idx==str.length())
			 { System.out.print(nstr+" ");return ; } 
		char cc=str.charAt(idx);
		subsequence(str,nstr+cc,idx+1);
		subsequence(str,nstr,idx+1);
	}
	public static void main(String[] args) 
	{
		String str="ABCD";
		subsequence(str," ",0);
		
	}
}
