package array;
import java.util.*;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the number of elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Array elements Stored: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}

	}

}
