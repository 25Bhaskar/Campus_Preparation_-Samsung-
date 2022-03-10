package Day1;

import java.util.*;
public class RemoveDublicateCharacterFromAString {

	public static void dublicate(String str)
	{
		LinkedHashSet <Character> set=new LinkedHashSet<>();
		for (int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		int size=set.size();
		System.out.println(size);
		char[] arr=new char[size];
		int i=0;
		for (Character c : set)
		{
			arr[i]=c;
			System.out.print(c);
			i++;
		}
		//adding set values in an array for easy access (if any)
		System.out.println(" ");
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]);
		}
		
	}
	public static void main(String[] args) 
	{
		String str="Hello How Are You";
		dublicate(str);
	}

}
