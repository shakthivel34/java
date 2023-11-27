package java_program;
import java.util.*;
public class perimetercuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length: ");
		int len=s.nextInt();
		System.out.print("Enter the Breadth: ");
		int bre=s.nextInt();
		System.out.print("Enter the height: ");
		int hei=s.nextInt();
		int result=(len+bre+hei)*4;
		System.out.print("The perimeter is: "+result);
		



	}

}
