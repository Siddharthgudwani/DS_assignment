package com.in;

import java.util.*;

public class Reverse_doubly_LL {

	static class Node {
		int key;
		Node next;
		Node prev;

		Node(int k) {
			key = k;
			next = prev = null;
		}
	}

	static Node head;

	public static void insert(Reverse_doubly_LL li, int e) {
		Node newnode = new Node(e);
		if (li.head == null) {
			head = newnode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = null;
			newnode.prev = temp;
		}
	}

	public static void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.key + " ");
			temp = temp.next;
		}
	}

	public static void displayrev() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != head) {
			System.out.print(temp.key + " ");
			temp = temp.prev;
		}
		System.out.print(head.key + " ");
	}

	public static void main(String args[]) {
		Reverse_doubly_LL li = new Reverse_doubly_LL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n = sc.nextInt();
		System.out.println("Enter elements ");
		for (int i = 0; i < n; i++) {
			insert(li, sc.nextInt());
		}
		System.out.println("LinkedList before reverse");

		display();
		System.out.println(" ");

		System.out.println("LinkedList after reverse");
		displayrev();

	}
}
