package practice;
import java.util.*;

public class posofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m,counter=0,a;
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		m=n;
		while(n>0)
		{
			n=n/10;
			counter++;
		}
		while(m>0)
		{
			a=m%10;
			System.out.println("Digit"+a+"postion is"+counter);
			m=m/10;
			counter--;
			
		}
		
		
		

	}

}
