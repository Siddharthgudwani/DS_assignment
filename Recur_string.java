package com.in;
import java.util.*;
public class Recur_string {
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("  Enter the no of Test-Cases");
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		System.out.println("  Enter the string");	
		String str=sc.next();
		System.out.println("  Answer: ");
		if(str.charAt(0)!=str.charAt(1))
		{
			System.out.print(str.charAt(0));
		}
		for(int i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)!=str.charAt(i+1) && str.charAt(i)!=str.charAt(i-1))
			{
				System.out.print(str.charAt(i));
			}
		}
		if(str.charAt(str.length()-1)!=str.charAt(str.length()-2))
		{
			System.out.println(str.charAt(str.length()-1));
		}
		}
	}
}
