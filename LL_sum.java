package com.in;

import java.util.*;

public class LL_sum {

	static class Node {
		int data;
		Node next;

		Node(int k) {
			data = k;
			next = null;
		}
	}

	Node head;

	public static LL_sum insert(LL_sum li, int data) {
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

	public static void display(LL_sum l) {
		if (l.head == null) {
			return;
		} else {
			Node p = l.head;
			while (p != null) {
				System.out.print(p.data);
				p = p.next;
			}
			System.out.println("");
		}
	}
//563
//842

	public static int nop(LL_sum l, int n) {
		Node temp = l.head;
		int k = n - 1;
		int i = 0;
		int no = 0;
		while (temp != null && i < n) {
			no = no + (temp.data * (int) Math.pow(10, i));

			i++;
			temp = temp.next;
		}
		return no;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		LL_sum l1 = new LL_sum();
		LL_sum l2 = new LL_sum();
		System.out.println("Enter size of LL");
		int m = sc.nextInt();
		System.out.println("Enter values of first LL");
		for (int i = 0; i < m; i++) {
			l1.insert(l1, sc.nextInt());
		}
		System.out.println("First LL");
		display(l1);
		int n1 = nop(l1, m);
		System.out.println("enter no. of elements of list 2");
		for (int i = 0; i < m; i++) {
			l2.insert(l2, sc.nextInt());
		}
		System.out.println("Second LL");
		display(l2);
		int n2 = nop(l2, m);
		int sum = n1 + n2;
		System.out.println(sum + "  <= answer");

	}
}
