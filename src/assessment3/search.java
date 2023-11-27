package assessment3;
import java.util.*;
public class search {

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
		System.out.println("Enter the element to be searched: ");
		int ele=s.nextInt();
		for (int i=0;i<n;i++)
		{
			if (ar[i]==ele)
			{
				System.out.print("The element: "+ar[i]+","+" At the position: "+(i+1));
			}
			
		}
		
		}

	}


