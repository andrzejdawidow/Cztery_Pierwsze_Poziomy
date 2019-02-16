import java.util.*;
import java.lang.*;
import java.io.*;

class MyMethod
{
	ArrayList<String> listOdd = new ArrayList<String>();
	ArrayList<String> listEven = new ArrayList<String>();
	
	public void distributor(ArrayDeque<String> exampleQueue){
		
		while (exampleQueue.size()>0){
			String temporaryValue = exampleQueue.poll();
			System.out.println("Pobrana wartosc: " + temporaryValue);
			int objectLength = temporaryValue.length();
			if (objectLength % 2 == 0){
				listEven.add(temporaryValue);
			}
			else {
				listOdd.add(temporaryValue);
			}
		}
		System.out.println("Zawartosc starej kolejki: " + exampleQueue);
		System.out.println("Zawartosc listy nieparzystej: " + listOdd);
		System.out.println("Zawartosc listy nieparzystej: " + listOdd.size() + " elementy");
		System.out.println("Zawartosc listy parzystej: " + listEven);
		System.out.println("Zawartosc listy parzystej: " + listEven.size() + " elementy");
	}
}

class Application
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 ArrayDeque<String> inscription1 = new ArrayDeque<String>();
		 
		 for(int n=0; n<50; n++){
		 	Random theGenerator1 = new Random();
			int fate = theGenerator1.nextInt(50)+1;
		 	System.out.println("Wylosowana liczba: " + fate);
		 	StringBuilder builder1 = new StringBuilder();
		 	for(int i=0; i<fate; i++){
				builder1.append("a");
				}
			inscription1.offer(builder1.toString());
		 }
		System.out.println(inscription1);
		System.out.println("Liczba obiektów w kolejce: " + inscription1.size());
		
		MyMethod separator = new MyMethod();
		separator.distributor(inscription1); //Zawartocią obiektu separator jest 
	}
}