package com.in;
import java.util.*;
public class Frequency_of_elements {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("ENTER elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j] && arr[j]!=0)
				{
					c++;
					arr[j]=0;
				}
			}
			if(arr[i] != 0)
			{
			System.out.println(arr[i]+" ==> "+c);
			}
		}
	}
}
