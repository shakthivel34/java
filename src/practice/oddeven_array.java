package practice;
import java.util.*;

public class oddeven_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the Elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Odd: ");
		for (int i=0;i<n;i++)
		{
			if (ar[i]%2!=0)
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Even: ");
		
		for (int i=0;i<n;i++)
		{
			if (ar[i]%2==0)
			{
				System.out.print(ar[i]+" ");
			}
		}

	}

}
