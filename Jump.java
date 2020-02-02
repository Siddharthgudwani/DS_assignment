package com.in;

import java.util.*;

public class Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the TestCases");
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.println("Enter the " + i + " no");
			int no = sc.nextInt();
			for (int j = 0; j <= no; j++) {
				if (j < 10) {
					System.out.print(j + " ");
				} else if (j >= 10 && j <= 99) {
					int d = j % 10;
					int dd = j - d;
					int k = dd / 10;
					if (d + 1 == k || d - 1 == k) {
						System.out.print(j + " ");
					}
				}
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
