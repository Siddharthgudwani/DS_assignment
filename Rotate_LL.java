package com.in;

import java.util.Scanner;

public class Rotate_LL {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void insert(int key) {
		Node temp = head;
		if (temp == null) {
			head = new Node(key);
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(key);
		temp.next = newNode;
		newNode.next = null;
	}

	public static void display(Rotate_LL li) {
		Node temp = li.head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
	}

	public static void rotate(Rotate_LL li, int k) {
		Node temp = li.head;
		Node curr = li.head;
		int i = 0;
		while (i < k - 1) {
			temp = temp.next;
			i++;
		}
		Node first = temp.next;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = li.head;
		head = first;
		temp.next = null;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Rotate_LL li = new Rotate_LL();
		System.out.print("Enter size of linkedlist  = ");
		int n = sc.nextInt();
		System.out.print("Enter elements ");
		for (int i = 0; i < n; i++) {
			int el = sc.nextInt();
			insert(el);
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		rotate(li, k);
		System.out.println("Answer = ");
		display(li);
		sc.close();

	}
}