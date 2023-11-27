package array;
import java.util.*;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of arrays: ");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter the position you want to insert: ");
		int pos=s.nextInt();
		System.out.println("Enter the insert element: ");
		int ele=s.nextInt();
		System.out.println("Before Insertion :");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int index=pos-1;
		int j=n;
		while (j>=index)
		{
			ar[j]=ar[j-1];
			j--;
		}
		ar[index]=ele;
		System.out.println();
		System.out.println("After Insertion:");
		for(int i=0;i<n+1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
		

	}

}
