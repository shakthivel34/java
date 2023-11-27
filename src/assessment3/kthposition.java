package assessment3;
import java.util.*;

public class kthposition {

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
		System.out.print("Enter the k th position at which you want to check number: ");
		int pos=s.nextInt();
		int index=pos-1;
		System.out.print("Number: ");
		System.out.print(ar[index]);

	}

}
