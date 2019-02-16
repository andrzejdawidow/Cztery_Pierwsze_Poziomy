/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class SchoolRegistry {
 
	ArrayList<Double> listOfGrades = new ArrayList<Double>();
	
	public void addGrades(Double grade) {
		listOfGrades.add(grade);
	}
	
	public void printGrades() {
		for (Double grade: listOfGrades){
			System.out.println(grade);
		}
	}
	
	public double minValue() {
		double minGrade = listOfGrades.get(0);
		for (Double grade: listOfGrades){
			if (grade < minGrade){
				minGrade = grade;
			}
		}
		System.out.println("Worst grade: " + minGrade);
		return minGrade;
	}
	
	public double maxValue() {
		double maxGrade = listOfGrades.get(0);
		for (Double grade: listOfGrades){
			if (grade > maxGrade){
				maxGrade = grade;
			}
		}
		System.out.println("Best grade: " + maxGrade);
		return maxGrade;
	}
	
	public void averageOfGrades() { 
		double sum = 0.0;
		double average = 0.0;
		
		for (Double grade: listOfGrades){
			sum += grade;
			}
		
		average = (sum - minValue() - maxValue()) / (listOfGrades.size() - 2);
		
		System.out.println("Average of grades /without best and worst/: " + average);
	}
}
	
class Book {
	
	String title;
	int	year;

	Book (String title, int	year) {
		this.title = title;
		this.year = year;
	}
	
	@Override
    public String toString() {
       return "The book " + this.title + " has been published in " + this.year;
    }
}

class Library {

	LinkedList<Book> listOfBooks = new LinkedList<Book>();

	public void addBook(Book book) {
		listOfBooks.add(book);
		}
		
	public void printBooks() {
		for (Book book: listOfBooks){
			System.out.println(book);
		}
	}
	
	public void bookSearching(int year) {
		for (Book book: listOfBooks) {
			if (book.year >= year) {
				System.out.println(book);
				}
			}
		}
}

class Application {
	
	public static void main (String[] args) throws java.lang.Exception {
	
	// first part
	
	System.out.println("Part ONE");
	System.out.println(" ");
	
	SchoolRegistry compScGrades = new SchoolRegistry();
	
	compScGrades.addGrades(2.0);
	compScGrades.addGrades(4.5);
	compScGrades.addGrades(3.0);
	compScGrades.addGrades(3.5);
	compScGrades.addGrades(5.0);
	compScGrades.addGrades(5.0);
	compScGrades.addGrades(3.0);
	
	compScGrades.printGrades();
	compScGrades.averageOfGrades();
	
	// Second part
	
	System.out.println(" ");
	System.out.println("Part TWO");
	System.out.println(" ");
	
	Library myBookShelf = new Library();
	
	myBookShelf.addBook(new Book("Il nome della rosa", 1983));
	myBookShelf.addBook(new Book("Storia della bellezza", 2004));
	myBookShelf.addBook(new Book("Storia della bruttezza", 2007));
	
	System.out.println("List of all books in the library");
	myBookShelf.printBooks();
	System.out.println(" ");
	System.out.println("List of books published after 2000");
	myBookShelf.bookSearching(2000);
	}
}