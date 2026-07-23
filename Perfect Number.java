import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(isPerfectNum(n))
	    {
	        System.out.print(n+" is the perfect number!");
	    }
	    else 
	    {
	        System.out.print(n+" is not p n");
	    }
		

		
		
       
	}
	public static boolean isPerfectNum(int n)
	{
	     boolean ist=false;
	    for(int i=1;i<=n;i++)
	    {
	        if(i*i==n)
	         ist=true;
	        
	    }
	    return ist;
	}
}
