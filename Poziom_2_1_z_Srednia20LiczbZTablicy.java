import java.util.*;
import java.lang.*;
import java.io.*;
class Average 
{
	public static void main (String[] args) throws java.lang.Exception 
	{
		int[] number = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		double sum = 0;
		
		for(int i=0; i < number.length; i++) {
			sum += number[i];
			System.out.println("Array element number[" + i + "] = " + number[i]);
		};
		System.out.println("Suma wszystkich liczb w tablicy to: " + sum);
		System.out.println("Wszystkich liczb w tablicy jest: " + number.length);
		System.out.println("Srednia wynosi: " + sum / number.length);
	}
}


