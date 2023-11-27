package assessment4;
import java.util.*;
public class heap_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Elements before heap Sorting: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("Elements After heap Sorting: ");
		for (int step=n-1;step>=0;step--)
		{
			int max=step;
			for (int i=step-1;i>=0;i--)
			{
				if (ar[max]<ar[i])
				{
					max=i;
				}
			}
			int temp=ar[step];
			ar[step]=ar[max];
			ar[max]=temp;
		}
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
