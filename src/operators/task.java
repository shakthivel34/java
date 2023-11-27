package operators;
import java.util.*;
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter the value of a:");
		a=s.nextInt();
		System.out.print("Enter the value of b:");
		b=s.nextInt();
		System.out.print("Enter the value of C:");
		c=s.nextInt();
		if (a>b&& a>c) {
		System.out.print("A is greater number:");
		}
		else if (b>a&&b>c) {
			System.out.print("B is greater number:");
			
		}
		else {
			System.out.print("C is greater number:");
		}
		
		
		
		
		

	}

}
