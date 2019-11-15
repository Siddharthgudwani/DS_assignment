
import java.util.*;

public class Balanced_string {

	
	public static void main(String args[])
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println(".......ENTER STRING.....");
	     String str=sc.next();
	     Stack<Character> s=new Stack<Character>();
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
	    	 {
	    		 s.push(str.charAt(i));
	    		 
	    	 }
	    	 else if(str.charAt(i)!='(' || str.charAt(i)!='{' || str.charAt(i)!='[')
	    	 {
	    		 s.pop();
	    	 }
	    	 
	     }
	     if(s.isEmpty())
	     {
	    	 System.out.println("Balanced string");
	     }
	     else
	     {
	    	 System.out.println(" not Balanced string");
	     }
	     
	}
	
}
