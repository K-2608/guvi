import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,k;
		Scanner s=new Scanner(System.in);
		k=s.nextInt();
		n=s.nextInt();
		int arr[]=new int[1000];
		for(i=k+1;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+ "");
			}
		}
	}
}
