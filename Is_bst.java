package com.in;

import java.util.Scanner;

public class Is_bst {
	static Node root;
	static int i = 0;

	public static class Node {
		int key;
		Node left;
		Node right;
       Node(int d) {
			key = d;
			left = null;
			right = null;}}

	static int arr[] = new int[100];

	public static void inOrder(Node root) {
           if (root != null) {
           inOrder(root.left);
			System.out.print(root.key + " ");
			arr[i] = root.key;
			i++;
			inOrder(root.right);}}

	public static void print() {
		int c = 0;
		for (int a = 0; a < i - 1; a++) {
			if (arr[a] > arr[a + 1]) {
				c++;}}
		if (c == 0)
			System.out.print(" IT A BST");
		else
			System.out.print("xxxx NOT A BST xxxx");}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Is_bst tree = new Is_bst();
		tree.root = new Node(5);
		tree.root.left = new Node(900);
		tree.root.right = new Node(7);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(6);
        System.out.println("Inorder of tree  ");
		inOrder(root);
		System.out.println();
		System.out.println("   ANSWER  ");
		print();
        sc.close();
	}
}