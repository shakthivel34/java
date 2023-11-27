package Collectionarray;
import java.util.*;

public class iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		ArrayList<String>arr=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.next());
		}
		
		System.out.println("Original content of arr:");
		
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		{
			Object element =itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
			
		ListIterator litr=arr.listIterator();
		while(litr.hasNext())
		{
			Object element =litr.next();
			litr.set(element+"+");
		}
		System.out.print("Modified contentes of arr:");
		itr =arr.iterator();
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		System.out.println("Modified list backwards:");
		while(litr.hasPrevious())
		{
			Object element=litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
		

	}

}