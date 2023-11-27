package Collectionarray;
import java.util.*;
public class linkedlist_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arr=new LinkedList<String>();
		arr.add("item 1 ");
		arr.add("item 2 ");
		arr.add("item 4 ");
		arr.add("item 7 ");
		arr.add(" item 5");
		arr.add("item 3 ");
		System.out.println("Linked list Content: "+arr);
		arr.addFirst("First Item");
		arr.addLast("Last Item");
		System.out.println("Linked list Content after addition: ");
		Object firstvar=arr.get(0);
		System.out.println("First element: "+firstvar);
		arr.set(0, "Changed First item");
		Object firstvar2=arr.get(0);
		System.out.println("First Element after update by set method: "+firstvar2);
		arr.removeFirst();
		arr.removeLast();
		System.out.println("Linked list after deletion of first and last element: "+arr);
		arr.add(0,"Newly added item");
		arr.remove(2);
		System.out.println("Final content: "+arr);
		Object str=arr.clone();
		System.out.println(str);
		arr.pollFirst();
		arr.pollLast();
		System.out.println(arr);
		
		
		
		

	}

}
