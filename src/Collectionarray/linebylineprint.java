package Collectionarray;
import java.util.*;

public class linebylineprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("John");
		alist.add("Suci");
		alist.add("TOm");
		alist.add("Shak");
		System.out.println("Array list: ");
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println("Array list using for each: ");
		for (String str1:alist)
		{
			System.out.println(str1);
		}
		System.out.println(alist.get(2));
		System.out.println(alist.indexOf("Suci"));
		
		

	}

}
