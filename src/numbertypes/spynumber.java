package numbertypes;
import java.util.*;
public class spynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,num1,add=0,mult=1;
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :  ");
		num=s.nextInt();
		String str1=String.valueOf(num);
		digit=str1.length();
		for (int i=digit;i>0;i--) {
			num1=num%10;
			num=num/10;
			add=num1+add;
			mult=num1*mult;
			}
		if (add==mult) {
			System.out.print("Spy number");
		}
		else  {
			System.out.print("Not a Spy number");
		}
		
		}
		
		
		

	}


