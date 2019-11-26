package com.in;
import java.util.*;
public class Array_sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array 1");
		int n=sc.nextInt();
		System.out.println("Enter size of array 2");
        int m=sc.nextInt();
		System.out.println("Enter value of k");
        int k=sc.nextInt();
		int arr1[]=new int [n];
		int arr2[]=new int [m];
		System.out.println("Enter values in First array");
        for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter values in  Second array");
        for(int j=0;j<m;j++)
		{
			arr2[j]=sc.nextInt();
		}
		System.out.println("Pairs are =>");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr1[i]+arr2[j]==k)
				{
					System.out.print(arr1[i]);
					System.out.print(arr2[j]);
					System.out.println("");
				}
			}
			
		}
	}

}
