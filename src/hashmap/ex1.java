package hashmap;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Zara", 8);
		m1.put("Mahnz", 31);
		m1.put("Madan", 12);
		m1.put("Swifty", 14);
		System.out.println();
		System.out.println("Map Elements ");
		System.out.print("\t"+m1);
		System.out.println(m1.get("Zara"));
		

	}

}
