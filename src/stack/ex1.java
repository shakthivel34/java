package stack;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<>();
		boolean result=stk.empty();
		System.out.println("Is the Stack Empty?"+result);
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(100);
		System.out.println("Elements in Stack: "+stk);
		result=stk.empty();
		System.out.println("Is the Stack empty?"+result);
		

	}

}
