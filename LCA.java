package com.in;

import java.util.*;

public class LCA {

	static class Node {
		int data;
		Node left;
		Node right;
        Node(int k) {
			data = k;
			left = right = null;
		}}

	Node root;

	Node findlca(Node root, int a, int b) {
		if (root == null)
			return root;
		if (root.data == a || root.data == b)
			return root;
		Node lft = findlca(root.left, a, b);
		Node rht = findlca(root.right, a, b);
		if (lft != null && rht != null)
			return root;
		return (lft != null) ? lft : rht;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LCA li = new LCA();
		li.root = new Node(1);
		li.root.left = new Node(2);
		li.root.right = new Node(3);
		li.root.left.left = new Node(4);
		li.root.left.right = new Node(5);
		li.root.right.left = new Node(6);
		li.root.right.right = new Node(7);
		System.out.println("Enter the first node");
		int a = sc.nextInt();
		System.out.println("Enter the second node");
		int b = sc.nextInt();
		Node nd = li.findlca(li.root, a, b);
		System.out.println("LCA of the two  nodes is =>");
		System.out.print(nd.data + " ");
	}
}
