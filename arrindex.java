
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[26];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		  System.out.println(a[i]+" "+i);
	}
}
