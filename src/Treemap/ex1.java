package Treemap;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String>tmap = new TreeMap<Integer,String>();//Tree map sorts in ascending order....
		
		tmap.put(12, "1Sri");
		tmap.put(34, "2Hari");
		tmap.put(46, "3Onel");
		tmap.put(67, "4ghost");
		tmap.put(56, "5police");
		
		for(Map.Entry me:tmap.entrySet())
		{
			System.out.println("Key:"+me.getKey()+" & Values"+me.getValue());
		}

	}

}

	


