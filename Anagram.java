package com.in;
import java.util.*;
public class Anagram {
     public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string 1");
    String a= sc.next();
    System.out.println("Enter string 2");
    String b= sc.next();
    int flag =0;
    char ch[]=a.toCharArray();
    char ch2[]=b.toCharArray();
    Arrays.sort(ch);
    Arrays.sort(ch2);
    for (int i = 0; i < ch.length; i++)

		{
        if (ch[i] != ch2[i])
              {flag++;}
        }

	if(flag>0)
	{
	    System.out.println("Not Anagram");
	}

	else if(flag==0)
	{
	    System.out.println("Anagram");
	}
	sc.close();
	}
	}
