package com.in;
import java.util.*;
public class Highest_prime {

	
	static boolean prime(int n) 
    { 
       if (n <= 1) 
            {
        	return false; 
            }
       for (int i = 2; i < n; i++) 
           {
    	     if (n % i == 0) 
                {
            	return false; 
            	}
            }
         return true; 
    } 
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to find the highest prime factor");
		int n=sc.nextInt();
		int max=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				if(prime(i))
				{
					if(i>max)
					{
						max=i;
					}
				}
			}
		}
		System.out.print("Answer");
		System.out.println(max);
		
	}
}
