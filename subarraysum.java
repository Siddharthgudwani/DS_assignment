import java.util.*;
public class subarraysum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int no=sc.nextInt();
		int arr[]=new int[no];
		System.out.println("enter the elements");
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		int c=0,s=0;
		for(int i=0;i<no;i++)
		{
			c=0;
			for(int j=i;j<no;j++)
			{

					c=c+arr[j];
					if(c==sum)
					{
						s++;
						System.out.println("starting index: "+i+"  "+"ending index: "+j);
						break;
					}
			}
		}
		if(s==0)
		{
			System.out.println("No subarray has sum equal to sum");
		}
	}
}