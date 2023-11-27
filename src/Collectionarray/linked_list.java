package Collectionarray;
import java.util.*;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		list.addFirst("Negan");
		list.addLast("Madan");
		list.add("Shakthi");
		System.out.println(list);
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		list.remove(2);
		System.out.print(list);

	}

}
