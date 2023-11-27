package data_structure;

public class max_height_tree {
	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public Node root;
	public max_height_tree()
	{
		root=null;
	}
	public int findheight(Node temp)
	{
		if (root==null)
		{
			System.out.println("Tree is empty");
			return 0;
		}
		else
		{
			int leftheight=0;
			int rightheight=0;
			
			if(temp.left!=null)
			{
				leftheight=findheight(temp.left);
			}
			if(temp.right!=null)
			{
				rightheight=findheight(temp.right);
			}
			int max=(leftheight>rightheight)?leftheight:rightheight;
			return(max+1);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max_height_tree mh=new max_height_tree();
		mh.root=new Node(1);
		mh.root.left=new Node(2);
		mh.root.right=new Node(3);
		mh.root.left.left=new Node(4);
		mh.root.left.right=new Node(5);
		mh.root.right.right=new Node(6);
		mh.root.left.left.left=new Node(7);
		mh.root.left.left.right=new Node(8);
		mh.root.left.left.left.left=new Node(9);
		mh.root.right.right.left=new Node(10);
		mh.root.right.right.left.left=new Node(11);
		mh.root.right.right.left.right=new Node(12);
		
		System.out.println("Maximum height is: "+mh.findheight(mh.root));

	}

}
