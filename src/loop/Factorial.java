package loop;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact;
	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number ");
		num=s.nextInt();
		fact=1;
		for (int i=num;i>0;i--) 
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
		

	}

}
