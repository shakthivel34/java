package assesment2;
import java.util.*;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if (arr[i]%2==0)
			{
				System.out.println("even number");
				
			}
			else 
			{
				System.out.println("odd number");
				
			}
		}
		
	
		}
			
		
		
		

	}


