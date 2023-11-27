package stack;
import java.util.*;
public class ex2 {
	static void pushelement(Stack<Integer>stk,int x)
	{
		stk.push(x);
		System.out.println("push ->"+x);
		System.out.println("stack: "+stk);
	}
	static void popeelement(Stack<Integer>stk)
	{
	   System.out.print("Pop ->");
	   Integer x=(Integer)stk.pop();
	   System.out.println(x);
	   System.out.println("Stack: "+stk);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<Integer>();
		System.out.println("Stack: "+stk);
		try
		{
			popeelement(stk);
		}
		catch(EmptyStackException e)
		{
			System.out.println("empty stack");
		}
		pushelement(stk,20);
		pushelement(stk,13);
		pushelement(stk,89);
		pushelement(stk,90);
		pushelement(stk,11);
		pushelement(stk,45);
		pushelement(stk,18);
		

	}

}
