package days;
import java.util.*;

public class convertdaysintoyears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of days: ");
		int days=s.nextInt();
		
		
		
		int year=days/365;
		days=days%365;
		int weeks=days/7;
		int days1=days%7;
		System.out.print(year+"Year"+" "+weeks+" "+"days"+days1);
		
		
		

	}

}
