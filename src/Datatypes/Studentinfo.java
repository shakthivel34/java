package Datatypes;

import java.util.Scanner;

public class Studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rollno,age;
String name;
char gender;
long contact;
Scanner s=new Scanner(System.in);
System.out.print("Enter the age:");
age=s.nextInt();
System.out.print("Enter the contact:");
contact=s.nextLong();
System.out.print("Enter the Roll no:");
rollno=s.nextInt();
System.out.print("Enter the Gender:");
gender=s.next().charAt(0);



	}

}
