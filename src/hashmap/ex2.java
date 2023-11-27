package hashmap;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm= new HashMap<Integer, String>();
		hm.put(12,"Chaitanya");
		hm.put(2,"Arun");
		hm.put(19,"Bot");
		hm.put(3,"Yo");
		hm.put(33,"Sudhakar");
		Set set=hm.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.print("Key is: "+mentry.getKey()+" &value is: ");
			System.out.println(mentry.getValue());
			
		}
		String var=hm.get(2);
		System.out.println("Value at Key 2 is:"+var);
		hm.remove(3);
		System.out.println("Map key and Values after removal: ");
		Set set2=hm.entrySet();
		Iterator iterator2=set2.iterator();
		while (iterator2.hasNext())
		{
			Map.Entry mentry2=(Map.Entry)iterator2.next();
			System.out.print("Key is : "+mentry2.getKey()+"&Value is: ");
			System.out.println(mentry2.getValue());
		}
		
		
	}

}
