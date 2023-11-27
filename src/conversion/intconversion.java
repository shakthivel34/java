package conversion;
import java.util.*;

public class intconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		char c;
		float d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any integer: ");
		a=s.nextInt();
		b=(byte)a; //(byte) inbuilt conversion
		System.out.println("Conversion into byte: "+b);
		c=(char)a;
		System.out.println("Conversion into Character: "+c);
		d=a;// larger = small condition
		System.out.println("Conversion into float: "+d);
		

	}

}
