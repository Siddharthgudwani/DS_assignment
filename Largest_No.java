package com.in;
import java.util.*;

public class Largest_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		int max = 0;
		int pos = 0;
		int arr[] = new int[n];
		Integer arr2[] = new Integer[n];
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
           }
		for (int i = 0; i < n; i++) {
			while (arr[i] >= 10)
				arr[i] /= 10;
            if (arr[i] > max) {
				max = arr[i];
				pos = i;
			}
		}
		System.out.println("answer");
		System.out.print(arr2[pos]);
		int t = arr2[pos];
		Arrays.sort(arr2, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			if (arr2[i] != t) {
				System.out.print(arr2[i]);
			}
		}
	}

}
