package queue;
import java.util.*;

public class dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("RIck");
		dq.add("Shakthi");
		System.out.println("Elements in Deque: "+dq);
		System.out.println("Removed Elemnt: "+dq.removeLast());
		System.out.println("Elements in Deque: "+dq);
		System.out.println("Removed Elemnt: "+dq.removeFirst());
		System.out.println("Elements in Deque: "+dq);
		dq.addFirst("Charles");
		System.out.println("Elements in Deque: "+dq);
		System.out.println("Head "+dq.element());
		System.out.println("Poll(): "+dq.pollLast());
		System.out.println("Peek(): "+dq.peek());
		System.out.println("Elements in Deque: "+dq);
		System.out.println("Elements in Empty: "+dq.isEmpty());
		
		
		
		
		
		
		
		
		

		
		

	}

}
