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
		int num=n;
		int s=0;
		int p=-1;
	    while(num>0)
	    {
	        int d=num%10;
	        p=d*d*d;
	        num/=10;
	       s+=p;
	    }
	    //int ans=s==n? 1:0;
	    System.out.println(n+" "+s);
	    System.out.print(s==n);
	  
	   
	}
}
