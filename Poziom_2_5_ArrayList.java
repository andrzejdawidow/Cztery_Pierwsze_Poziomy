import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayListTest
{
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<String> library = new ArrayList<String>();
        
        library.add("50 shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last Mohikan");
        library.add("The infinity");
        library.add("Better Call Soul");
        library.add("A Journey Into the Earth");
        library.add("Binary Death");
        library.add("Breaking Bad");
        library.add("50000 miles undersea journey");
        library.add("the Titanfall");
        library.add("Coma");
        library.add("People and Ants");
        library.add("To understand the Woman");
        library.add("Neverending Story");
        library.add("Book of Jungle");
        
        //for(int n=0; n < library.size(); n++) {
          //System.out.println("Element " + n + " of the library is: " +
          //library.get(n));
          
        for(String book: library) {
            System.out.println("Element of the library is: " + book);
        }
    }
}