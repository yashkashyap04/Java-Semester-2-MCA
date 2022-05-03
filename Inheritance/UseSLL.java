public class UseSLL{
	public static void main(String[] args){
	SLL myList = new SLL();
	
	myList.insertAtBegin(10);
	myList.insertAtBegin(20);
	myList.insertAtBegin(30);

	System.out.println("Total sum of values in list is " + myList.getSum());
	System.out.println("Max is: " + myList.findMax());
	
	SLL myList2 = new SLL(myList);
	myList2.insertAtBegin(40);
	myList2.print();
	
	System.out.println("MyList : ");
	myList.print();
	
	SLL myList3 = new SLL();
	myList.print();
	
	myList3.insertAtBegin(10);
	myList3.insertAtBegin(20);
	myList3.insertAtBegin(30);
	System.out.println("MyList 3: ");
	myList3.print();
	
	System.out.println("Two list are equals: " + myList.equals(myList3));
}

}
