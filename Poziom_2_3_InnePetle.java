import java.util.*;
import java.lang.*;
import java.io.*;
class BetterDynamicLoop 
{
	public static void main (String[] args) throws java.lang.Exception 
	{
		String[] names = new String[5];
			names[0] = "Cat";
			names[1] = "Dog";
			names[2] = "Horse";
			names[3] = "Elephant";
			names[4] = "Tiger";
		for(String name : names) {
			System.out.println(name);
		};
		System.out.println(names.length);
	}
}