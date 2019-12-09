package com.in;
import java.util.*;
public class Merge_2_sorted_array {

	public static void  merge(int arr1[], int n1, int arr2[], int n2, int arr3[])
	{
		int i=0;
		int j=0;
		int k=0;
		while(i<n1 & j<n2)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k]=arr1[i];
				k++;
				i++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
				k++;
				
			}
		}
//		while(i<n1)
//		{
//			arr3[k]=arr1[i];
//			k++;
//			i++;
//			
//		}
//		while(j<n2)
//		{
//			arr3[k]=arr2[j];
//			j++;
//			k++;
//		}
		System.out.println("Resultant array is:- ");
		for(int p=0;p<arr3.length;p++) {
			System.out.print(arr3[p]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter elements");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of 2 array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enter elements");
		for(int j=0;j<size2;j++) {
			arr2[j]=sc.nextInt();
		}
		int arr3[]=new int[size1+size2];
		merge(arr1, size1, arr2, size2, arr3);
		
		sc.close();
	}
}
