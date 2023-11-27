package extractdigits;
import java.util.*;

public class increasedigitsby1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		String x="";
		System.out.println("Enter the Number: ");
		a=s.nextInt();
		while (a>0)
		{
			b=a%10;
			c=b+1;
			x=c+x;
			a=a/10;
			
			
		}
	
		
		System.out.print(x);
		
		

	}

}
