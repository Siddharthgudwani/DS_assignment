package com.in;
import java.util.*;
public class Remove_dupl {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter string");
		String str=sc.next();
	    int len=str.length();
	    char arr[]=new char[str.length()];
	    for(int i=0;i<len;i++)
	    {
	       	arr[i]=str.charAt(i);
	    }
	    System.out.println("Answer");
	    if(arr[0]!=arr[1])
	    {
	    	System.out.print(arr[0]);
	    }
	    

	    
	    for(int i=1;i<len-1;i++)
	    {
	    	if(arr[i]!=arr[i+1])
	    	{
	    		if(arr[i]!=arr[i-1])
	    		System.out.print(arr[i]);
	    	}
	    }
	    
	    if(arr[len-1]!=arr[len-2])
	    {
	    	System.out.print(arr[len-1]);
	    }
		
	}
}

