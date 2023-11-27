package practice;
import java.util.*;

public class deletion {

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
		System.out.println("Enter the position to be deleted: ");
		int pos=s.nextInt();
		//System.out.println("Enter the 2nd position to be deletd :");
		//int pos2=s.nextInt();
		
		ar[pos-1]=ar[n-1];
		//ar[pos2-1]=ar[n-2];
		System.out.print("After deletion: ");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
