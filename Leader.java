package com.in;

import java.util.*;

public class Leader {

	public static void lop(int arr[], int n) {
		for (int i = 0; i < n - 1; i++) {
			int c = 0;
			for (int j = i + 1; j < n; j++) {
				if (!(arr[i] >= arr[j])) {
					c++;
				}
			}
			if (c == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print(arr[n - 1]);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Answer:");
		lop(arr, n);
		sc.close();
	}
}
