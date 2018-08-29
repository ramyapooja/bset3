/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int arr[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a);
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
	}
}
