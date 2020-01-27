package com.in;
import java.util.*;
public class LLSum {

	public static class Node
	{
		int data;
		Node right;
		Node left;
		Node(int k)
		{
			data=k;
			right=left=null;
					
		}
	}
	static Node head;
	public static void insert(int n)
	{
		head=insr(head,n);
	}
	public static Node insr(Node head,int n)
	{
		Node newnode=new Node(n);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
		   Node temp=head;
		   while(temp.right!=null)
		   {
			     temp=temp.right;
		   }
		   temp.right=newnode;
		   newnode.right=null;
		}
		return head;
	}
	public static void sum(int sum)
	{
		Node temp=head;
		while(temp!=null)
		{
			Node temp1=temp;
			while(temp1!=null)
			{
				if(temp.data+temp1.data==sum)
				{
					System.out.println(temp.data+","+temp1.data);
				}
				temp1=temp1.right;
			}
			temp=temp.right;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  LLSum li=new LLSum();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of LL");
      int n=sc.nextInt();
      System.out.println("Enter elements of LL");
      for(int i=0;i<n;i++)
      {
    	  li.insert(sc.nextInt());
      }
      System.out.println("Enter the value of X");
      int s=sc.nextInt();
      System.out.println("Pairs having sum "+s+" are ");
      li.sum(s);
      sc.close();
	}

}
