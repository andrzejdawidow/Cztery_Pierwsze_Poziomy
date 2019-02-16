// to nie działa dobrze
interface Qest {
	void process();	
}
 
class DeadIslandQuest implements Qest {
	public void process() {
 		System.out.println("dupa jas");
	}
}
 
class EliteKnightQuest implements Qest {
	public void process() {
		System.out.println( "franek stas");
	}
}
 
class Knight {
 	public String cos( Quest quest ) { 
		System.out.println(quest.process());
	}
} 
 
class Application {
	public static void main (String[] args) throws java.lang.Exception
	{
	System.out.println("jeju");
 
	}
}