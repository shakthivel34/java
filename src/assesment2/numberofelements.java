package assesment2;
import java.util.*;

public class numberofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.print("Elements stored one by one:"  );

		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("The length of elements is: "+ar.length);
				
		

	}

}
