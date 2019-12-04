package com.in;
import java.util.*; 
public class Chocolate {

	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("enter size ");
		int n=sc.nextInt();
		int pos=0;
		int min=100;
		int arr[]=new int [n];
		System.out.print("enter elements ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter size of window");
		int m=sc.nextInt();
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
		 System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		for(int i=0;i<n-m;i++)
		{
			 
			if(arr[i+2]-arr[i]<min)
			{
				min=arr[i+2]-arr[i];
				 pos=i;
			}
		}
		System.out.println("The Minimum Difference is="+min+'\n'+"if we pick these packets => "+arr[pos]+","+arr[pos+1]+","+arr[pos+2]);
		
	}
}
