package practice;



public class singlylinked {
	class Node5
	{
		int data;
		Node5 next;
		public Node5(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node5 head=null;
	public Node5 tail=null;
	
	public void addelement(int data)
	{
		Node5 newnode=new Node5(data);
		if (head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void insertatbegin(int data)
	{
		Node5 newnode=new Node5(data);
		head.next=newnode;
		head=newnode;
	}
	public void insertatend(int data)
	{
		Node5 newnode=new Node5(data);
		if (head==null)
		{
			head=newnode;
			tail=newnode;
			return;
		}
		
		tail.next=newnode;
		tail=newnode;
				
	}
	
	public void display()
	{
		Node5 current=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(current!=null)
			{
				System.out.println("Nodes of the list is: ");
				System.out.println(current.data);
				current=current.next;
				
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlylinked s=new singlylinked();
		s.display();
		s.addelement(1);
		s.addelement(2);
		s.insertatbegin(11);
		s.addelement(33);
		s.insertatend(44);
		s.addelement(22);
		s.display();
		

	}

}
