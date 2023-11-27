package data_structure;


class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}

public class Tree_node {
	Node root;
	Tree_node(){
		root=null;
	}
	void postorder(Node node) {
		if(node==null)
			return;
		
		//traverse left
		postorder(node.left);
		//traverse right
		postorder(node.right);
		//traverse root
		System.out.print(node.item+"->");
	}
	void inorder(Node node) {
		if(node==null)
			return;
		
		//traverse left
		inorder(node.left);
		//traverse root
		System.out.print(node.item+"->");
		//traverse right
		inorder(node.right);
		
	}
	void preorder(Node node) {
		if(node==null)
			return;
		
		//traverse root
	    System.out.print(node.item+"->");
		//traverse left
	    preorder(node.left);
		//traverse right
		preorder(node.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_node tree=new Tree_node();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		
		System.out.println("Inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);
		

	}







	}


