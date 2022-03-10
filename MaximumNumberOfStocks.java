package Day1;
/*
 * Questions : In a stock market,there is a product with its infinite stocks.
 * The stock prices are given for N days,
 * where arr[i[ denotes the price of the stock on the ith day
 * . There is a rule that a customer can buy at most i stock on the ith day.
 * If the ustomer has an amount of k amount of money initially, find out the maximum number of stocks a customer can buy.
 * 
 * For example , for 3 days the price of a stock is given as 7,10,4 . You can buy 1 stock worth 7 rs on day 1, 2 stocks worth 10rs each on day 2 and 3 stock worth 4rs each on day 3.
 * 
 */
import java.util.*;
public class MaximumNumberOfStocks 
{
		public static void main(String[] args) 
		{
			Map<Integer,Integer> m=new TreeMap<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of entries : ");
			int n=sc.nextInt();
			System.out.println("Price :");
			int []arr=new int[n];
			
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
				m.put(arr[i],(i+1));
			}
			Arrays.sort(arr);
			System.out.print("K value: ");
			int k=sc.nextInt();
			
			int sum=0,stock=0,j=0;
			while(sum<=k && j <=2)
			{
				sum=sum+m.get(arr[j])*arr[j];
				if (sum<=k)
						stock+=m.get(arr[j]);
				else
					{ 
					sum=sum-m.get(arr[j])*arr[j];
					for(int p=1;p<=m.get(arr[j]);p++)
					{
						sum+=arr[j];
						if (sum<=k)
							stock+=1;
					}
					}
				j++;
			}
			System.out.println(stock);
			
			//Additional for printing 
			for (Map.Entry<Integer,Integer> ob : m.entrySet())
			{
				System.out.println(ob.getKey()+" - - "+ob.getValue());
			}
	}
}