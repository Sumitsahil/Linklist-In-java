package LinkedList;

public class Linkedlist {

	//private ListNode head;  //Head Node to the List..
	// Given a Listnode,print all elements it holds..
	
	//Lets insert a new node at the begining..
	
	public ListNode InsertAtBegining(ListNode head , int data)
	{
		ListNode newNode = new ListNode(data);
		if(head== null) {
			return newNode;
		}
		
		newNode.next= head;
		head= newNode;
		return head;//This head will hold the new head,insert data at the begining..
		
		
	}
 // lets insert a newnode at the end of hte list..
	public ListNode InsertAtEnd(ListNode head , int data)
	{
		ListNode newNode = new ListNode(data);
		if(head== null) {
			return newNode;
		}
		
		ListNode current = head;
	while(null!= current.next) {
		current= current.next;

	}
	current.next= newNode;
	return head;
	
	}
	
	//lets insert a new node at the mid of the list..
	public void insertAfter(ListNode previous , int data)
	{
		if(previous== null)
		{
			System.out.println("Prevoius Node Can not be Null");
			return;
		}
		
		ListNode newNode = new ListNode(data);
		newNode.next=previous.next;
		previous.next= newNode;
	}
	
	private void display(ListNode head) {
		if (head == null) return;
		ListNode current = head;

    	
    	while(current!= null)
    	{
    		System.out.print(current.data  + " --> ");
    		current= current.next;
    	}
    	System.out.print(current);
		
	}

	//it contains a static inner class ListNode.
	private static class ListNode {
		
		private int data;
		private ListNode next;
		 private ListNode(int data) {
		 this.data=data;
		 this.next=null;
		
		
	}

}
	
	//Given In Link list, Findout the length of linklist..
	
	public int length(ListNode head)
	{
		if(head == null) return 0;
		//create  a count variable which hold the length..
		
		int count=0;
		// loop each element and increment the count till list ends..
		ListNode current = head;
		while(current!=null) {
			count++;
			//move to next node..
			current = current.next;
			
		}
		return count;
		
		
		
	}
	
	public ListNode insertAtPosition(ListNode head , int data , int position)
	{
		int size = length(head);
		
		if(position > size +1 || position < 1)
		{
			System.out.println("Invalid Position");
			return head ;
		}
		ListNode newNode = new ListNode(data);
		if(position == 1)
		{
			newNode.next = head;
			return newNode;
		}
		else {
			ListNode previous= head;
			int count =1;
			while(count< position -1) {
				previous =previous.next;
				count++;
			
			}
			ListNode current = previous.next;
			newNode.next= current;
			previous.next= newNode;
			return head;
			
		}
	}
	
	
    public static void main(String[] args) {
    	
    	//Lets create a link list demonstrated in slide..
    	//10-->20-->30-->40-->null..
    	//10 as a head node in the list..
    	
    	ListNode head = new ListNode(10);
    	ListNode second=new ListNode(20);
    	ListNode third = new ListNode(30);
    	ListNode fourth=new ListNode(40);
    	
    	head.next=second;
    	second.next = third;
    	third.next=fourth;
    	fourth.next=null;
    	
    	Linkedlist linklist = new Linkedlist();
    	linklist.display(head);
    	System.out.println();
    	//System.out.println("The Length Of the List is " + linklist.length(head));
     // ListNode newhead = linklist.InsertAtBegining(head, 0);
       //  ListNode newhead = linklist.InsertAtEnd(head, 50);
    	head  =linklist.insertAtPosition(head, 35, 4);
         linklist.display(head);
    	
    		
    	}
    	
    	
    }
    