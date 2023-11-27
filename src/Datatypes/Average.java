package Datatypes;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float mark1,mark2,mark3;
		String studentname,studentid,studentinfo;
		float average;
		float total;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the student name:");
		studentname=s.next();
		System.out.print("Enter the student ID:");
		studentid=s.next();
		System.out.print("Enter the student Info:");
		studentinfo=s.next();
		System.out.print("Enter the mark 1:");
		mark1=s.nextFloat();
		System.out.print("Enter the mark 2:");
		mark2=s.nextFloat();
		System.out.print("Enter the mark 3:");
		mark3=s.nextFloat();
		total=mark1+mark2+mark3;
		average=total/3;
		System.out.println("Total:"+total);
		System.out.print("Average:"+average);
		
		
		
		
	
		
		
		
		
		

	}

}
