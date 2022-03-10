package Day1;
import java.util.*;
//Printing the diagonal elements of a user input 2D array.
public class general {
	public static void main(String[] args) {
		int [][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0,j=0;i<3 || j<3;i++,j++)
		{
			System.out.print(arr[i][j]+" ");
		}
	}
}
