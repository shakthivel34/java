package practice;
import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		int year=s.nextInt();
		if (year%4==0)
		{
			System.out.println("It is a leap year ");
			
		}
		else
		{
			System.out.println("Not a leap year ");
		}

	}

}
