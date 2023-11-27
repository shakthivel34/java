package practice;

public class singly_linked_list1 {
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
		
		public void addNode(int data)
		{
			Node newNode=new Node(data);
			if (head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
		}
		public void display()
		{
			Node current=head;
			if (current==null)
			{
				System.out.println("list is empty");
			}
			else
			{
				System.out.println("Nodes of the list");
				while(current!=null)
				{
					System.out.println(current.data);
					current=current.next;
				}
			}
		}
		
		public void delpos(int data)
		{
			Node del=new Node(data);
			if(del.data==head.data)
			{
				head=head.next;
			}
			else
			{
				Node del2=head;
				while(del2.next!=null)
				{
					del2.next=del2.next.next;
				}
				del2=del2.next;
			}
		}
		public void delpos1(int pos)
		{
			Node posi=head;
			int i=2;
			if(pos==1)
			{
				posi.next=posi.next.next;
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singly_linked_list1 sl=new singly_linked_list1();
		sl.addNode(1);
		sl.addNode(2);
		sl.display();
		sl.delpos(2);
		sl.display();
		
		

	}

	
		
	}


