package practice;
import java.util.*;

public class charity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of people: ");
		int peo=s.nextInt();
		System.out.println("Enter the number of clothes: ");
		int clo=s.nextInt();
		int result=clo/peo;
		if (result>0)
		{
			System.out.println("Maximum clothes are: "+result);
			
		}
		else
		{
			System.out.println("-1");
		}

	}

}
