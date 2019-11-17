package com.in;

import java.util.Scanner;

public class RemoveDuplicateLL {
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
  public static void insert(int key) {
		Node temp=head;
		if(temp==null) {
			head=new Node(key);
			return;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(key);
		temp.next=newNode;
		newNode.next=null;
	}
  public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
  public static void removeduplicate(RemoveDuplicateLL li) {
		Node current=li.head;
		while(current!=null) {
			int data1=current.data;
			Node next_node=current.next;
			Node temp=current;
			while(next_node!=null) {
				int data2=next_node.data;
				if(data1==data2) {
					temp.next=next_node.next;
				}
				temp=temp.next;
				next_node=next_node.next;
			}
			current=current.next;
		}
	}
  
	public static void main(String args[]) {
		RemoveDuplicateLL rm=new RemoveDuplicateLL();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of linkedlist  = ");
		int n=sc.nextInt();
		System.out.print("Enter elements "); 
		for(int i=0;i<n;i++) {
			int el=sc.nextInt();
			insert(el);
		}
		removeduplicate(rm);
    		System.out.println("Answer = ");
		display();
		
	}
}