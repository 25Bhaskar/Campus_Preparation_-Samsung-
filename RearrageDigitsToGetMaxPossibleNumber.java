package Day1;
import java.util.*;
public class RearrageDigitsToGetMaxPossibleNumber 
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int c=0,i=0,a=0,num1=num;
		while(num>0)
		{
			num/=10;c++;
		}
		System.out.println(c);
		int [] arr=new int[c];
		while(num1>0)
		{
			a=num1%10;
			num1/=10;
			arr[i]=a;
			i++;
		}
		Arrays.sort(arr);
		for(int j=c-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}
}

