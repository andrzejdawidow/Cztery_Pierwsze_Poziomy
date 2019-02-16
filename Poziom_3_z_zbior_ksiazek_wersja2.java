import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Library {
	String title;
	String author; 
	String theYearOfPublishment;
	
	public Library(String title, String author, String theYearOfPublishment) {
		this.title = title;
		this.author = author;
		this.theYearOfPublishment = theYearOfPublishment;
	}
	
	public int hashCode() {
		return Integer.parseInt(theYearOfPublishment);
	}
	
	public boolean equals(Object o) {
		Library e = (Library) o;
		return (title.equals(e.getTitle())) &&
				(author.equals(e.getAuthor())) &&
				(theYearOfPublishment.equals(e.theYearOfPublishment));
	}
	
	public String toString() {
		return title + ", " + author + ", " + "rok wydania: " + theYearOfPublishment;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTheYearOfPublishment() {
		return theYearOfPublishment;
	}
}

class HashSetLibraryExample {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		Library book1 = new Library("Korona Krolow1", "Ela Cherezinska", "2009");
		Library book2 = new Library("Korona Krolow2", "Ela Cherezinska", "2010");
		Library book3 = new Library("Korona Krolow3", "Ela Cherezinska", "2011");
		Library book4 = new Library("Korona Krolow4", "Ela Cherezinska", "2012");
		Library book5 = new Library("Korona Krolow5", "Ela Cherezinska", "2013");
		
		HashSet<Library> booksSet = new HashSet<Library>();
		booksSet.add(book1);
		booksSet.add(book2);
		booksSet.add(book3);
		booksSet.add(book4);
		booksSet.add(book5);
		
		for(Library theBook: booksSet) {
//		    if(theBook.getTheYearOfPublishment() < 2010)
			System.out.println(theBook);
		}
	}
}
