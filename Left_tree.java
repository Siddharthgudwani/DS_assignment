package com.in;

public class Left_tree {

	
	
	 static class Node
	    {
	        int data;
	        Node left;
	        Node right;
	        Node(int d)
	        {
	            data=d;
	            left=right=null;
	        }
	    }
	 static Node root;
	
	public static void left()
	{
	    System.out.print(root.data+" "+root.left.data);
	    Node temp=root.left;
	    Node tempr=root;
	    if(temp.right!=null)
	    {
	       tempr=temp.right;
	    }
	    while(temp.left!=null)
	    {
	    	System.out.print(temp.left.data);
	    	temp.left=temp.left.left;
	    }
	    while(tempr.left!=null)
	    {
	    	System.out.print(tempr.left.data);
	    	tempr.left=tempr.left.left;
	    }
	    
	}
	
	
	public static void main(String args[])
	{
	Left_tree t1=new Left_tree();
    t1.root=new Node(1);
    t1.root.left=new Node(2);
    t1.root.right=new Node(3);
    t1.root.left.left=new Node(4);
    t1.root.left.right=new Node(5);
    t1.root.right.right=new Node(6);
    t1.root.left.right.left=new Node(7);  
    t1.root.left.right.left.right=new Node(8); 
    left();
	}

}