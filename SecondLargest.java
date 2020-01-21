package com.in;

import java.util.*;

public class SecondLargest {

	public static int largest(int arr[], int n) {
		int max = arr[0];
		int pos = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				pos = i;
			}
		}
		arr[pos] = -1;
		return (max);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Largest :  " + largest(arr, n));
		System.out.println("Secondlargest :  " + largest(arr, n));

	}

}
