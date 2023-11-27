package array;
import java.util.*;
public class update_element {

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
		System.out.println("Enter the position to be updated: ");
		int pos=s.nextInt();
		System.out.println("Enter the element to be updated: ");
		int ele=s.nextInt();
		System.out.println("Before update: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("After the update: ");
		ar[pos-1]=ele;
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		

	}

}
