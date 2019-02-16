import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Library {
	String title;
	String author; 
	LocalDate theYearOfPublishment;
	
	public Library(String title, String author, int year, int month, int day) {
		this.title = title;
		this.author = author;
		this.theYearOfPublishment = LocalDate.of(year, month, day);
	}
	
	public int hashCode() {
		return theYearOfPublishment.getYear() * 100;
	}
	
	public boolean equals(Object o) {
		Library e = (Library) o;
		return (title.equals(e.getTitle())) &&
				(author.equals(e.getAuthor())) &&
				(theYearOfPublishment.getYear() == e.getTheYearOfPublishment().getYear()) &&
				(theYearOfPublishment.getMonthValue() == e.getTheYearOfPublishment().getMonthValue()) &&
				(theYearOfPublishment.getDayOfMonth() == e.getTheYearOfPublishment().getDayOfMonth());
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
	
	public LocalDate getTheYearOfPublishment() {
		return theYearOfPublishment;
	}
}

class HashSetLibraryExample {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		Library book1 = new Library("Korona Krolow1", "Ela Cherezinska", 2009, 1, 1);
		Library book2 = new Library("Korona Krolow2", "Ela Cherezinska", 2010, 2, 2);
		Library book3 = new Library("Korona Krolow3", "Ela Cherezinska", 2011, 3, 3);
		Library book4 = new Library("Korona Krolow4", "Ela Cherezinska", 2012, 4, 4);
		Library book5 = new Library("Korona Krolow5", "Ela Cherezinska", 2013, 5, 5);
		
		HashSet<Library> booksSet = new HashSet<Library>();
		booksSet.add(book1);
		booksSet.add(book2);
		booksSet.add(book3);
		booksSet.add(book4);
		booksSet.add(book5);
		
		for(Library theBook: booksSet) {
		    if(theBook.getTheYearOfPublishment().getYear() < 2010)
			System.out.println(theBook);
		}
	}
}
