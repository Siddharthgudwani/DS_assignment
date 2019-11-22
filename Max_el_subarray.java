package com.in;
import java.util.*;
public class Max_el_subarray {
	public static void max(int arr[], int n, int p) {
		
		int c = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++)

				{
					if (arr[k] > p) {
						c++;
					}}}}
		System.out.println(c);
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
