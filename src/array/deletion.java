package array;
import java.util.*;
public class deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of arrays: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the array elements one bye one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Enter the delete position: ");
		int pos=s.nextInt();
		System.out.println("Before deletion:");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		int j=pos;
		while (j<n)
		{
			ar[j-1]=ar[j];
			j++;
		}
		System.out.println();
		System.out.println("After deletion:");
		for (int i=0;i<n-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
		

	}

}
