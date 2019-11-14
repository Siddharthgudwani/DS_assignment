

import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("......Enter String to find REVERSE........");
		String str = sc.next();
		char ch[] = str.toCharArray();
		int l = str.length();
		char ch2[] = new char[l];
		int j = 0;
		for (int i = 0; i < l; i++) {
			if (ch[i] <= 122 && ch[i] >= 65) {
				ch2[j] = ch[i];
				j++;
			}
		}
		char so[] = new char[j];
		int m = j;
		for (int i = 0; i < j; i++) {
			so[m - 1] = ch2[i];
			m = m - 1;
		}
		int s = 0;

		for (int i = 0; i < l; i++) {
			if (ch[i] <= 122 && ch[i] >= 65) {

				ch[i] = so[s];
				s++;
			}
		}
		System.out.print("REVERSE  =>  ");
		for (int i = 0; i < l; i++) {
			System.out.print(ch[i]);
		}
	}
}
