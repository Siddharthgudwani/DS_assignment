package com.in;
import java.util.*;
public class Max_element_in_a_subarray {

	public static void max(int arr[],int n,int k)
	{
		int max=0;
		for(int i=0;i<n-k;i++)
		{
			max=arr[i];
			for(int j=i+1;j<k+i;j++)
			{
				if(max<arr[j])
					max=arr[j];
			}
			System.out.print(max+" ");
				
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter elements of array ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter max length of subarray ");
		int k=sc.nextInt();
				System.out.println("  ANSWER    ");
		max(arr,n,k);
	}
}
