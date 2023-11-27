package programs;
import java.util.*;

public class largestno_ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter all three elements: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("Largerst Number is: "+d);

	}

}
