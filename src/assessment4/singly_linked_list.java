package assessment4;
import java.util.*;

public class singly_linked_list {
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public  void addNode(int data)
	{
		Node Newnode=new Node(data);
		if ( head==null)
		{
			head=Newnode;
			tail=Newnode;
		}
		else
		{
			tail.next=Newnode;
			tail=Newnode;
		}
		
	}
	public void Insertatbegin(int data)
	{
		Node Newnode=new Node(data);
		Newnode.next=head;
		head=Newnode;
	}
	public  void insertatend(int data)
	{
		Node Newnode=new Node(data);
		if ( head==null)
		{
			head=null;
			tail=null;
		}
		else
		{
			tail.next=Newnode;
			tail=Newnode;
		}
	}
	public void display()
	{
	 Node current =head;
	 if (head==null)
	 {
		 System.out.println("List is empty");
		 return;
	 }
	 else 
	 {
	  System.out.println("Node of linked list: ");
	 
	  while (current!=null)
	  {
	 System.out.println(current.data);
	 current=current.next;
	}
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_linked_list sl=new singly_linked_list();
	   sl.display();
	   sl.addNode(10);
	   sl.addNode(20);
	   sl.insertatend(100);
	   sl.addNode(30);
	   sl.addNode(40);
	   sl.Insertatbegin(1000);
	   sl.Insertatbegin(2000);
	   sl.display();
		
		
	
		
		
		
		

	}

}
