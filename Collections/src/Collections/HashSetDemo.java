package Collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args)
	
	{
		HashSet<String> set=new HashSet<String>();  
		set.add("abc");  
		set.add("abd");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  