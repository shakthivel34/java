package assesment;
import java.util.*;

public class Sherlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the Number of apples: ");
		a=s.nextInt();
		System.out.print("Enter the number of people: ");
		b=s.nextInt();
		if ( a%b==0) {
			System.out.println("The result is : 1");
			}
		else {
			System.out.println("The result is : 0");
			
		}

	}

}
