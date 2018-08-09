import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int t1,t2,t=0,h=0,m;
		if(h1<=24&&h2<=24&&m1<=60&&m2<=60)
		{
			t1=h1*60+m1;
			t2=h2*60+m2;
			if(t1>t2)
			{
				t=t1-t2;
			}
			else
			            t=t2-t1;
		}
		else
		  System.out.println("Invalid input");
		h=t/60;
		m=t%60;
		System.out.println(h+" "+m);
	}
}
