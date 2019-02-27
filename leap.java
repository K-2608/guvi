import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                
                if ( year % 400 == 0)
                   { leap = true;}
                else
                    {leap = false;}
            }
            else
                {leap = true;}
        }
        else
            {leap = false;}

        if(leap)
            {System.out.println("yes");}
        else
           { System.out.println("no");}
    }
}
	
