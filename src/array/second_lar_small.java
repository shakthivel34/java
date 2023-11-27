package array;
import java.util.*;

public class second_lar_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		
		
		System.out.println("Second largest number: "+ar[n-count-1]);
		System.out.println(" smallest number: "+ar[0] );

	}

}
