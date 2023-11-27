package array;
import java.util.*;


public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Enter the element to be searched: ");
		int search=s.nextInt();
		for (int i=0;i<n;i++)
		{
			if(ar[i]==search)
			{
				System.out.println("The search element is: "+search+" At position: "+ (i+1));
			}
		}

	}

}
