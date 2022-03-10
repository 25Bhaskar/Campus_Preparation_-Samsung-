package Day1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Taking user input using BufferedReader and output using BufferedWriter
public class P3 
{
	public static void main(String[] args) throws IOException 
	{
		//Take Input from user and print on console
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();// It reads String 
	int n=Integer.parseInt(br.readLine()); // Now compulsory to give input as a integer value otherwise it will show an exceptions
	
	//Write on console / file 
	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); 
	//in place of "new OutputStreamWriter(System.out)" we can give (new fileWrite("filename.txt',true'); to write in a specified file
	bw.write(str); // write in bw object
	bw.flush(); // Print on console
	
	
	}

}
