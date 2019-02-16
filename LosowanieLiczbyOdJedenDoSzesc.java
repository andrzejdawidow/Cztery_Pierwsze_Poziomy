import java.util.*;
//import java.lang.*;
//import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Random r = new Random();
		int x = 1;
		int y = 6;
		int a = r.nextInt(y-x+1)+x;
		System.out.println(a);
	}
}