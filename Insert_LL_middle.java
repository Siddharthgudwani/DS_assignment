package com.in;
import java.util.*;
public class Insert_LL_middle {

	static class Node
	{
		int key;
		Node next;
		Node(int k)
		{
			key=k;
			next=null;
		}
	}
	static Node head;
	public static void insert(int k)
	{
		Node newnode=new Node(k); 
		if(head==null)
		{
			head=newnode;
			newnode.next=null;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			
		}
	}
	
	public static void inp(int k,int n)
	{
		Node newnode = new Node(k);
		
		int i=1;
		int pos=0;
		if(n%2==0)
		{
			pos=n/2;
		}
		else
		{
			pos=(n+1)/2;
		}
		
		
		if(head!=null)
		{
			Node temp=head;
			while(temp!=null)
		{
			if(i==pos)
			{
				newnode.next=temp.next;
				temp.next=newnode;
				
				
				
			}
			
			i++;
			temp=temp.next;
			
		}
		}
	}
	
	public static void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.key+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Insert_LL_middle li=new Insert_LL_middle ();
		System.out.println("enter size");
		int n=sc.nextInt();	
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			insert(sc.nextInt());
		}
		System.out.println("before insertion");
		li.display();
		System.out.println("");
		System.out.println("enter no to be inserted at middle");
		int p=sc.nextInt();
		System.out.println("");
		li.inp(p,n);
		System.out.println("ANSWER ");
		li.display();
		
	}
}
