interface Quest{
	String process();	
}
 
class DeadIslandQuest implements Quest {
	public String process() {
		return  "Pozabijal wszystkich wrogow" ;
	}
}
 
class EliteKnightQuest implements Quest {
	public String process() {
		return  "Najlepszy z najlepszych zabil smoka";
	}
}
 
class Knight {
	public String story( Quest quest ) { 
		return  quest.process()  ;
	}
} 
 
class Application
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Knight knight = new Knight();
		String answer = knight.story( new EliteKnightQuest() ) + '\n' + knight.story( new DeadIslandQuest() );
		System.out.println( "Wyglada to tak: \n" + answer );
	}
}