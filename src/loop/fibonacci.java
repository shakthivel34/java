package loop;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,f1,f2,f3;
		f1=0;
		f2=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number to generate: ");
		num=s.nextInt();
		System.out.print(f1 +" "+f2+" ");
		for (int i=2;i<num;i++)
		{
		f3=f1+f2;
		System.out.print(f3+" ");
		f1=f2;
		f2=f3;}
		
				
		
		
		
				
		

	}

}
