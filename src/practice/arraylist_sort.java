package practice;
import java.util.*;

public class arraylist_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			al.add(s.next());
		}
		System.out.println("Before Sorting: ");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("Before Sorting: ");
		System.out.println(al);
		

	}

}
