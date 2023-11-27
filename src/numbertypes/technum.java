package numbertypes;
import java.util.*;

public class technum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=s.nextInt();
		int temp;
		int temp2;
		int add;
		int result;
		
		
			temp=num%100;
			temp2=num/100;
			
			
			add=temp+temp2;
			result= (int) Math.pow(add,2);// add,2 used for sqauring
			
			if (result==num) {
			System.out.print("Technumber ");
			}
			else {
				System.out.print(" Not a Technumber  "); 
			}
			
			
			
			
			
			
			
			
		
			
		
			
			
		}
		

	}


