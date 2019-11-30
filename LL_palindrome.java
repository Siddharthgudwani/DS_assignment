package com.in;
import java.util.*;

import com.in.LL_sum.Node;
public class LL_palindrome {

	static class Node {
		int data;
		Node next;

		Node(int k) {
			data = k;
			next = null;
		}
	}

	Node head;
	
	public static LL_palindrome insert(LL_palindrome li, int data) {
		Node n1 = new Node(data);
		n1.next = null;
		if (li.head == null) {
			li.head = n1;
		} else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = n1;
		}
		return li;
	}

	public static int   noprev(LL_palindrome l, int n) {
		Node temp = l.head;
		int k = n - 1;
		int i = 0;
		int no = 0;
		while (temp != null && i < n) {
			no = no + (temp.data * (int) Math.pow(10, i));

			i++;
			temp = temp.next;
		}
		return  no;

	}
	
	public static int  nop(LL_palindrome l, int n) {
		Node temp = l.head;
		int k = n - 1;
		int i = 0;
		int no = 0;
		while (temp != null && k>=0) {
			no = no + (temp.data * (int) Math.pow(10, k));

			k--;
			temp = temp.next;
		}
		return  no;

	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LL_palindrome l1=new LL_palindrome();
		System.out.println("Enter size of LL");
		int m = sc.nextInt();
		System.out.println("Enter values of first LL");
		for (int i = 0; i < m; i++) {
			l1.insert(l1, sc.nextInt());
		}
		if(nop(l1,m) == noprev(l1,m))
		{
			System.out.print("Palindrome LL");
		}
		else
		{
			System.out.print("Not Palindrome");
		}
		
	}
	
}
