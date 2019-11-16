package com.in;

import java.util.*;

public class Longest_substring {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".......  Enter string  .......");
		String s = sc.next();
		String[] st = new String[100];
		int k = 0;
		int m = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);

				if (palindrome(str) == true) {
					st[k] = str;
					k++;
				}
			}
		}
		int max = 0;
		int pos = 0;
		for (int i = 0; i < k; i++) {
			if (st[i].length() > max) {
				max = st[i].length();
				pos = i;
			}
		}
		System.out.println(st[pos]);
	}

	public static boolean palindrome(String str) {

		int i;
		int n = str.length();
		for (i = 0; i < n; i++) {
			if (str.charAt(i) != str.charAt(n - 1 - i))
				break;
		}
		if (i == n) {
			return true;
		} else

			return false;

	}
}