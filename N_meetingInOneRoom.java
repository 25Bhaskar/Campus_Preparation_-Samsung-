package Day1;
/*
 * You are given the schedule of N meetings with their start time Start[i] and 
 * end time End[i]. But you have only 1 meeting room. 
 * So, you need to tell the meeting numbers you can organize in the given room, such that
 * the number of meetings organized is maximum.
 * Note :
 * The start time of one chosen meeting can’t be equal to the end time of the other 
 * chosen meeting. Also for the same end time, a meeting with a smaller index is preferred. 
 */

import java.util.Arrays;
import java.util.Scanner;

public class N_meetingInOneRoom 
{
		public static int meetings(int[] S,int []E, int n)
		{		
			int i=1,j=0;   
			int pf=1,mp=0;
			while(i<n && j<n)
			{
				if (E[j]<S[i])
					{ pf++; j=i; i++;  }
				else if (E[j]>=S[i])
				{ i++;}
				if (pf>=mp)
					mp=pf;
			}
			return mp;
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			int []S= {1,3,0,5,8,5};
			int []E= {2,4,6,7,9,9};
			int n=S.length;
			int mp=meetings(S,E,n);
			
			System.out.println("Maximum meetings are : "+mp);
		}

}
