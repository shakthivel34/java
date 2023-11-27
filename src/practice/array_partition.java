package practice;
import java.util.*;

public class array_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		int len=ar.length;
		System.out.println("Enter the values one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
			if(ar[i]==2)
			{
				System.out.println(ar[i]);
				System.out.println(ar[i+1]+" , ");
			}
			
		}
		
		

	}

}


