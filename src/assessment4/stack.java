package assessment4;
import java.util.*;

public class stack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		st.pop();
		st.pop();
		System.out.println(st);
		int size=st.size();
		System.out.println(size);
		
	
		
		

	}

}
