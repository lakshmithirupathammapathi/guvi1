import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int exp,base,i;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		exp=sc.nextInt();
		int result=1;
		for(i=0;i<exp;i++)
		{
			result=result*base;
	}
	System.out.println(result);
	}
}
