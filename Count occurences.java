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
		int d=sc.nextInt();
		int count=0;
		for(int i=0;i<=n;i++)
		{
		    int curr=i;
		    while(curr>0)
		    {
		        int f=curr%10;
		        if(f==d)
		        {
		           count++; 
		        }
		        curr/=10;
		    }
		}
		System.out.print(count);

	}
}
