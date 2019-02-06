import java.util.*;
import java.lang.*;
import java.io.*;


class Even
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner s=new Scanner(System.in);
	 int a;
	 a=s.nextInt();
	 if(a<0)
	 {
	 	System.out.println("invalid");
	 }
	 else if(a%2==0)
	 {
	 System.out.println("Even");
	}
	else
	 {
     System.out.println("Odd"); 		
	} 
}
}
