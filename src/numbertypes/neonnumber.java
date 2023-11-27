package numbertypes;
import java.util.*;
public class neonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num,digit,square,num1,add=0;
		System.out.print("Enter the number: ");
		num=s.nextInt();
		square=(int) Math.pow(num,2);
		String str1=String.valueOf(square);
		digit=str1.length();
		for (int i=digit;i>0;i--) {
			num1=square%10;
			square=square/10;
			add=num1+add;
			
			
		}
		if (add==num) {
			System.out.print("Neon Number");
		}
		else  {
			System.out.print(" Not a Neon Number");
		}
		
			
		

		
		
		
		
		
				

	}

}
