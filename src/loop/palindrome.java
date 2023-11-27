package loop;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num,remainder,result;
	
		num=s.nextInt();
		int d=num;
		result=0;
		while (num!=0) {
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
		}
		
		if (result==d) {
			System.out.println("palindrome");
		}
		else {
			System.out.print(" not palindrome");
			
		}

	}

}
