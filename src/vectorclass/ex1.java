package vectorclass;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec=new Vector<String>(2);
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		vec.addElement("Fig");
		System.out.println("Size is: "+vec.size());
		System.out.println("Default capacity increment is: "+vec.capacity());
		vec.addElement("fruit1");
		vec.addElement("fruit12");
		vec.addElement("Fruit3");
		System.out.println("Size after addition: "+vec.size());
		System.out.println("Capacity after increment is: "+vec.capacity());
		//vec.addElement("fruit1");
		//vec.addElement("fruit12");
		//vec.addElement("Fruit3");
		//vec.addElement("Fruit3");
		//System.out.println("Size after addition: "+vec.size());
		//System.out.println("Capacity after increment is: "+vec.capacity())
		Enumeration en=vec.elements();
		System.out.println("\nElements are: ");
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+ " ");
			
		}
		
		
		
		

	}

}
