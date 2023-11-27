package assessment3;
import java.util.*;

public class countoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the array size: ");
		int n=s.nextInt();
		int ar[]=new int[n];
	    System.out.println("Enter the Elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			
		}
		System.out.print("Enter the element of which you want to count number of occurence: ");
		int oc=s.nextInt();
		for (int i=0;i<n;i++)
		{
			if (ar[i]==oc)
			{
				count++;
			}
			
		}
		
		System.out.println("Number of occurence: "+count);
		
		
			

	}

}
