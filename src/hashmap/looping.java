package hashmap;
import java.util.*;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(11, "AB");
		hm.put(2, "CD");
		hm.put(33, "EF");
		hm.put(9, "GH");
		hm.put(3, "IJ");
		System.out.println("For loop: ");
		for (Map.Entry me :hm.entrySet())
		{
			System.out.println("Key: "+me.getKey()+"&Value: "+me.getValue());
		}
		System.out.println("While Loop: ");
		Iterator iterator=hm.entrySet().iterator();
		while (iterator.hasNext())
		{
			Map.Entry me2=(Map.Entry) iterator.next();
			System.out.println("Key: "+ me2.getKey()+"&Value: "+me2.getValue());
		}

	}

}
