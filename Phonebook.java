package com.in;
import java.util.*;
public class Phonebook {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of phonebook");
		int n=sc.nextInt();
		HashMap<String, Integer> hmap= new HashMap<>();
		System.out.println("Enter the name first and then the phone number");

		for(int i=0;i<n;i++)
		{
			hmap.put(sc.next(), sc.nextInt());
			
		}
		System.out.println("Enter the name to be searched");
		String name=sc.next();
		if(hmap.get(name)!=null)
		{
			System.out.println(name+" = "+hmap.get(name));

		}
		else
		{
			System.out.println("phone number Not Found");
		}
	}
}
