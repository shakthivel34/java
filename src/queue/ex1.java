package queue;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<String>();
		q.add("Maggie");
		q.add("Negan");
		q.add("MAdan");
		q.add("Daryl");
		System.out.println("Elements in Queue: "+q);
		System.out.println("Removed Element: "+q.remove());
		System.out.println("HEad: "+q.element());
		System.out.println("poll(): "+q.poll());
		System.out.println("peek(): "+q.peek());
		System.out.println("Elements in Queue: "+q);
		
		

	}

}
