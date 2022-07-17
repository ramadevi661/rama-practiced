package Collections;

import java.util.*;


public class ListExample
{
	public static void main(String[] args) 
	{
	List<String> l1 = new ArrayList<String>();
		l1.add("rama");
		l1.add("rama");// duplicates are allowed
		l1.add("devi");
		for(String name : l1)//iteration using for each loop  (type var:array)
		{
			System.out.println(name);
		}

		
	}

}
