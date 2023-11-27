package java_program;
import java.util.*;
public class nobita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the purchased Price: ");
		int num=s.nextInt();
		System.out.println("Enter the Selling Price: ");
		int num1=s.nextInt();
		int diff=num-num1;
		System.out.println("Absolute difference : "+Math.abs(diff));
		
		
		

	}

}
