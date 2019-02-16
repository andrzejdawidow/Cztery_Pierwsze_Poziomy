import java.util.*;
import java.lang.*;
import java.io.*;

class WyscigiSum {
	
	public static void main(String[] args) throws java.lang.Exception{
		
		int sumaA = 1000;
		int sumaB = 0;
		int numerPetli = 0;
		Random randomGenerator = new Random();
		
		while (sumaA > sumaB){
			numerPetli++;
			System.out.println("Petla nr: " + numerPetli);
			int pierwszaLosowana = randomGenerator.nextInt(10);
			int drugaLosowana = randomGenerator.nextInt(50);
			System.out.println("Pierwsza wylosowana liczba to: " + pierwszaLosowana + ". Druga wylosowana liczba to: " + drugaLosowana);
			sumaA = sumaA + pierwszaLosowana;
			sumaB = sumaB + drugaLosowana;
			System.out.println("sumaA = " + sumaA + ", sumaB = " + sumaB + "\n");
		}
	}
}