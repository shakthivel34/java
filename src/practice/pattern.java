package practice;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of patterns: ");
		int p=s.nextInt();
		for (int i=0;i<p;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}

	}

}
