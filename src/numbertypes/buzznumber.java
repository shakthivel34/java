package numbertypes;
import java.util.*;
public class buzznumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num,digit,num1,modulo;
		num=s.nextInt();
		
		modulo=num%10;
		if (modulo==7) {
			System.out.print("Buzz number");
			
		}
		else if (num%7==0) {
			System.out.print("Buzz number");
			
		}
		else {
			System.out.print("Not a Buzz number");
			
		}
		

	}

}
