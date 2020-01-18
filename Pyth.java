package com.in;


import java.util.*;
import java.lang.Math;

public class Pyth {

   public static void find(int arr[],int n)
   {
     Arrays.sort(arr);
     int flag=0;
     for(int i=0;i<n;i++)
      {
        int lop=arr[i]*arr[i];
        for(int j=0;j<n-1;j++)
        {
             if(Math.pow(arr[j],2) +Math.pow(arr[j+1],2)==lop)
             {
                flag++;
             }
        }
      }
      if(flag>0)
      {
          System.out.println("  yes  ");
      }
      else
      {
    	  System.out.println("  No  ");
      }
   }
//   5
//   13
//   0
//   12
//   9
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no test cases");
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
        System.out.println("Enter the size of array");
          int n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("Enter the array elements");
               for(int j=0;j<n;j++)
                {
                    arr[j]=sc.nextInt(); 
                }
               
           find(arr,n);
        }
    sc.close();
   }
}
