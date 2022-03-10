package Day1;
import java.util.*;

//SamSung coding round question 1 : Print each digit after subtracting it from 9
// example: input : 253 
//         output : 746
//  illustration  : 9-2=7, 9-5=4, 9-3=6 
public class changenumberbysub9fromit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		ArrayList  <Integer> arr=new ArrayList<>();
		int a,b;
		a=0;
		b=0;
		while(num>0)
		{
			a=num%10;
			b=9-a;
			arr.add(b);
			num/=10;
		}
		for(int i=arr.size()-1;i>=0;i--)
		{
			System.out.print(arr.get(i));
		}
		
	}

}
