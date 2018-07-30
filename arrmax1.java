import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n[]=new int[26];
		int m=sc.nextInt();
		int max=n[0];
		for(int i=0;i<m;i++)
		  n[i]=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			if(max<n[i])
			  max=n[i];
		}	  
		System.out.println(max);
	}
}
