import java.util.*;
import java.lang.*;
import java.io.*;
 
class Student
{
	private String firstName;
	private String lastName;
	private String peselId; 
 
	public Student( String firstName, String lastName, String peselId ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.peselId = peselId;
	}; 
 
	@Override
	public boolean equals(Object o){
	final Student e = (Student) o;
		return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) &&
				this.peselId.equals(e.peselId);
	}

	public int hashCode(){
		return Integer.parseInt(peselId.substring(0, 5));
	}
 
	public String toString(){
		return firstName + " " + lastName + " (" + peselId + ")";	
	}
}
 
class GradesStudent
{
	private Double math;
	private Double physics;
	private Double chemistry;
 
	public GradesStudent( Double math, Double physics, Double chemistry ){
	this.math = math;
	this.physics = physics;
	this.chemistry = chemistry;		
	}
 
	public Double getGradesmath(){
		return math;
	}
	public Double getPhysics(){
		return physics;
	}
	public Double getChemistry(){
		return chemistry;
	}
	public Double getGradePointAverage(){
		Double average = ( math + physics + chemistry ) / 3;
	//	String s = String.format( "%.1f", average );
	//	average = Double.parseDouble( s );
		return  average;
	}
 
	@Override
	public String toString(){
		return ", srednia ocen z semestru: " + getGradePointAverage();
	}
}
 
class Application
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Student student1 = new Student( "Andi", "Olczyk", "12345678901" );
		Student student2 = new Student( "Franek", "Dolas", "12345612345" );
		Student student3 = new Student( "Aga", "Cosiek", "12345698765" );
		Student student4 = new Student( "Minio", "Ferma", "12345045678" );
		Student student5 = new Student( "Tosiek", "Kisiel", "12345045679" );
 
		GradesStudent grades1 = new GradesStudent( 5.0, 3.0, 4.0 ); 
		GradesStudent grades2 = new GradesStudent( 5.0, 4.5, 5.0 );
		GradesStudent grades3 = new GradesStudent( 2.0, 3.0, 2.5 );
		GradesStudent grades4 = new GradesStudent( 4.0, 3.0, 4.0 );
		GradesStudent grades5 = new GradesStudent( 2.5, 4.5, 5.0 );
 
		HashMap< Student, GradesStudent > result = new HashMap< Student, GradesStudent >();
 
			result.put( student1, grades1 );
			result.put( student2, grades2 );			
			result.put( student3, grades3 );			
			result.put( student4, grades4 );
			result.put( student5, grades5 );	
 
		for( Map.Entry<Student, GradesStudent> entry  : result.entrySet()){
			System.out.print( entry.getKey() + " " + entry.getValue() + ".\n" );
		}
	}
}