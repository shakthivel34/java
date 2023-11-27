package union;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]A= {22,45,33,66,55,34,77};
		Integer[]B= {33,2,83,45,3,12,55};
		Set<Integer>set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer>set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		Set<Integer>union_data=new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union of set 1 and set2 is: ");
		System.out.println(union_data);
		Set<Integer>intersection_data= new HashSet<Integer>(set1);
		intersection_data.retainAll(set2);
		System.out.print("Intersection of set1 and set2 is: ");
		System.out.println(intersection_data);
		Set<Integer>difference_data=new HashSet<Integer>(set1);
		difference_data.removeAll(set2);
		System.out.print("Difference of set 1 and set 2is: ");
		System.out.println(difference_data);
		
		

	}

}
