package programs;
import java.util.*;

public class incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any integer a: ");
		a=s.nextInt();
		b=++a;
		System.out.println("Result after pre Increment a: "+a);
		System.out.println("Result after pre Increment b: "+b);
		c=a++;
		System.out.println("Result after pre Increment a: "+a);
		System.out.println("Result after post Increment c: "+c);
		d=--a;
		System.out.println("Result after pre Increment a: "+a);
		System.out.println("Result after pre Increment d: "+d);
		e=a--;
		System.out.println("Result after pre Increment a: "+a);
		System.out.println("Result after post Increment e: "+e);
		
		

	}

}
