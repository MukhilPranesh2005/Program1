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
		int temp=n;
		int s=0;
		//int c=String.valueOf(n).length();
		int c=0;
		while(temp>0)
		{
		     int di=temp%10;
		    c++;
		    temp/=10;
		}
        while(num>0)
        {
            int d=num%10;
            int p=(int)Math.pow(d,c);
            num/=10;
            s+=p;
        }
        if(s==n)
        {
            System.out.print(s+" is a Amstrong number!");
        }
        else
        {
            System.out.print(s+" is not a Amstrong number!");
        }
        
        
		

		
		
       
	}
}
