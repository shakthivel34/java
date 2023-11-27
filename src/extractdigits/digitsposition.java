package extractdigits;
import java.util.*;

public class digitsposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m,a,counter=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=s.nextInt();
		int c=1;
		int arr[]= new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Digits at position"+c+":"+arr[i]);
			c++;
			
			
		}
		
//		m=n; 
//		while(n>0)
//		{
//			n=n/10;
//			counter++;
//		}
//		int c=1;
//		int num=10000;
//		while(m>0)
//		{
//			int z=m/num;
//			System.out.println("Digits at position"+c+":"+z);
//			c++;
//			num=num/10;
//		}
//		int z=1;
//		while(n>0)
//		{
//			n=n/10;
//			
//			a=m%10;
//			System.out.println("Digits at position"+z+":"+a); 
//			m=m/10;
//			z++;
//			
//			
//		}
			
			

	}

}
