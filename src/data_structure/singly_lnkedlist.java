package data_structure;

public class singly_lnkedlist {
	class Node
	{
		int data;
		Node next; // Node connects the next node;
		public Node(int data)
		{
			this.data=data;
			this.next=null;// using this. because parameter and class variable are same
		}
	}
	public Node head=null;// implementation 1
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data); // crating a Node
		if (head==null)
		{
			head=newNode; // if there is only one node ,head and tail both are that node
			tail=newNode;
		}
		else
		{
			tail.next=newNode;  // if there is two node we can connect the next node by this
			tail=newNode;       // declaring the 2nd node as tail
		}
	}
	public void insertAtBeginning(int data) // Inserting a new node at beginning(it becomes head)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAtend(int data) // Inserting a new node at beginning(it becomes head)
	{		
		Node new_node1=new Node(data);
		if (head==null)
		{
			head=new_node1;
			tail=new_node1;
			return;
		}
		tail.next=new_node1;
		tail=new_node1;
	
	}
	public void delete(int data)
	{
		Node dlnode= new Node(data);
		if(dlnode.data==head.data)
		{
			head=head.next;
			
		}
		else
		{
			Node ptr1= head;
			while(ptr1.next!=null)
			{
				if(ptr1.next.data==data)
				{ 
					ptr1.next=ptr1.next.next;
					
				}
				ptr1=ptr1.next;
			}
			
		}
	}
	
	public void delpos(int pos)
	{
		Node posi = head;
	int i=2;
		if(pos==1)
		{
			head=head.next;
			
		}
		else
		{
			
			while(posi!=null)
			{
				
				if(pos==i)
				{
					 posi.next=posi.next.next;
				}
				posi=posi.next;
				i++;
			  
			}
			
		}
	}
	//4 -0 5 6 8 9 
	public void insertpos(int pos,int data)
	{
		Node in= new Node(data);
		int i=1;
		Node curr=head;
		while(curr!=null)
		{
			if(i==pos-1)
			{
				in.next=curr.next.next;
				curr.next=in;
				
			}
			curr=curr.next;
			i++;
		}
		
		
    }
	
	public void duplicate()
	{
		int flag=0;
		Node dupli=head;
		
		while(dupli!=null)
		{
			Node dummy=dupli.next; 
			while(dummy!=null)
			{
				if(dupli.data==dummy.data)
				{
				 	flag=1;
				}
				dummy=dummy.next;
			}
			dupli=dupli.next;
		} 
		if(flag==1)
		{
			System.out.println("There is duplicate");
		}
		else
		{
			System.out.println("NO duplicate");
		}
			
				
		
	}
	
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("List is empty");
			return; // returns breaks the loop and directly goes to main
		}
		else 
		{
			System.out.println("Nodes of Singly Linked LIst: ");
			while (current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("Node is Completed");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_lnkedlist sl=new singly_lnkedlist();
//		sl.display();
//		sl.addNode(1);
//		sl.addNode(2);
//		sl.addNode(3);
//		sl.insertAtend(100);
//		sl.addNode(4);
//		sl.addNode(10);
//		sl.insertAtBeginning(20);
//		sl.display();
//		sl.delete(100);
//		
//		sl.insertpos(2, 13);
//		sl.display();
	    sl.addNode(1);
	    sl.addNode(2);
	    sl.addNode(3);
	    sl.addNode(4);
	    sl.addNode(5);
	    sl.addNode(6);
	    sl.display();
	    sl.insertpos(2, 0);
	   // sl.addNode(1);
	   
	    sl.display();
	    sl.duplicate();
		
		

	}

}
