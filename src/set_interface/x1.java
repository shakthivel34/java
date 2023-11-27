package set_interface;
import java.util.*;

public class x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[]= {34,22,10,60,30,22};
		Set<Integer>set =new HashSet<Integer>();
		for(int i=0;i<count.length;i++)
		{
			set.add(count[i]);
		}
		System.out.println(set);
		TreeSet<Integer> sortedset= new TreeSet<Integer>(set);
		System.out.println("The Sorted list is: ");
		System.out.println(sortedset);
		System.out.println("The first element of the set is: "+(Integer)sortedset.first());
		System.out.println("The last element of the set is: "+(Integer)sortedset.last());
		
		
		
		

	}

}
