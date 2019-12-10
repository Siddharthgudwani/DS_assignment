package com.in;
import java.util.*;

public class TwoD_array_spiral {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no rows");
		
		int r=sc.nextInt();
		System.out.println("enter no cols");
		int c=sc.nextInt();
		System.out.println("enter elements");
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Answer");
		int row=0;
		int col=0;
		while(row<r && col <c) {
		for(int k=col;k<r;k++)
		{
			System.out.print(arr[row][k]+" ");
	    }
		row++;
		for(int k=row;k<r;k++)
		{
			System.out.print(arr[k][c-1]+" ");
		}
		c--;
		

		if(row<r)
		{
			for(int i=c-1;i>=col;i--)
			{
				System.out.print(arr[r-1][i]+" ");
			}
			r--;
		}	
		if(col<c)
		{
			for(int i=r-1;i>=row;i--)
			{
				System.out.print(arr[i][col]+" ");
			}
			col++;
		}
		}
	}
}

