package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("rama");
		list.add("uma");
		list.add("devi");
		list.add("raju");
		Iterator<String> itr=list.iterator(); 
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

}
} 