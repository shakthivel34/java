package assesment;
import java.util.*;
public class charity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Number of people");
		a=s.nextInt();
		System.out.println("Number of clothes");
		b=s.nextInt();
		int result=b/a;
		if (result>0) 
		{
			System.out.println("Answer :"+result);
	
		}
		else
		{
			System.out.println("Answer : -1");
		}
		
			
		

	}

}
