package Collectionarray;
import java.util.*;

public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		System.out.println("Enter the elemnts one by one: ");
		for (int i=0;i<n;i++)
		{
			alist.add(s.next());
		}
		System.out.println("Array list: ");
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println("Array list using for each: ");
		for (String str1:alist)
		{
			System.out.print(str1);
		}
		System.out.println(alist.get(2));
		System.out.println(alist.indexOf("Suci"));
		

	}

}
