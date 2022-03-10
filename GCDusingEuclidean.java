package Day1;
// Greatest Common Divisior : Using Euclidean Algorithms
public class GCDusingEuclidean 
{
	static int gcd(int a,int b)
	{
		if (b==0)
				return a ;
		else
			return gcd(b,a%b);
	}
	public static void main(String[] args) 
	{
		int a=36;
		int b=24;
		System.out.println(gcd(a,b));
	}
}