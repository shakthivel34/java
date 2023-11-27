package variable;
import java.util.*;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Two Numbers: ");
		double first,second;
		first=s.nextDouble();
		second=s.nextDouble();
		System.out.print("Enter the Operator(+,-,*,/):");
		char operator=s.next().charAt(0);
		double result=0;
		switch (operator) 
		{
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
			default :
			System.out.print("Enter the Correct Operator : ");	
		}
		System.out.printf("%.1f %c %.1f=%.1f ",first,operator,second,result);
		
		
		

	}

}
