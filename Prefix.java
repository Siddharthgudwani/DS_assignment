package com.in;
import java.util.*;
public class Prefix {
public static String postfix(String str)
	{
	Stack<String> st=new Stack<String>();
	int n=str.length();
		for(int i=n-1;i>=0;i--)
		{if(str.charAt(i)<65)
			{
				String s1=st.peek();st.pop();
				String s2=st.peek();st.pop();
				String t3=s1+s2+str.charAt(i);
                  st.push(t3);
				}	else
			{st.push(str.charAt(i)+"");}
		}
		return st.peek();
		}
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prefix Expression");
		String str=sc.next();
		 System.out.println("Postfix : "+ postfix(str));
		
		
	
}
}
