class LinkedListExample
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//Create the list and fill it with 1000 sequent numbers
	//multiplied by 2
		LinkedList<Integer> theList = new LinkedList<Integer>();
		for(int n = 0; n < 1000; n++){
		theList.add(n*2);
		}
		//Retrieve and display element at index 760
		System.out.println("List element at index 760 equals: " + theList.get(760));
		//insert new element with value 500 at index 760
		theList.add(760, 500); //theList.remove(760);
		//Checking out the value of element at index 760:
		System.out.println("List element at index 760 equals: " + theList.get(760));
		//Checking size of the list after addition of one element
		System.out.println("List size (after addition of 1 element) equals: " +
		theList.size());
	}
}