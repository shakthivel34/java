package data_structure;
import java.util.*;
class SortedList1
{
	public ArrayList<Integer> list;
	public SortedList1()
	{
		list= new ArrayList<Integer>();
	}
	public boolean isEmpty()
	{
		return list.size()==0 || list==null;
	}
	public void clear()
	{
		list=new ArrayList<Integer>();
	}
	public int size()
	{
		return list.size();
	}
	public void add(int ele)
	{
		int pos=list.size();
		list.add(ele);
		while (pos>0 &&ele<list.get(pos-1));
		{
		list.set(pos, list.get(pos-1));
		pos--;
		}
		list.set(pos,ele);
	}
	public void remove(int ind)
	{
		list.remove(ind);
	}
	public int binarysearch(int ele)
	{
		
	}
	
	
	
	
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

