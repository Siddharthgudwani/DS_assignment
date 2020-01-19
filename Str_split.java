package com.in;
import java.util.*;
public class Str_split {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Test-Cases");
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		System.out.println("Enter the string");
		String str=sc.next();
		 String arr[]=str.split("\\.");
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.print(arr[i]+".");
		}
		System.out.println(arr[0]);
		System.out.println(" ");
		}
	}
//	pqr.mno
	
}
