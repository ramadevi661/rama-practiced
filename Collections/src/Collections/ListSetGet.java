package Collections;
import java.util.*;
public class ListSetGet {

	public static void main(String[] args)
	{
		List<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("mango");
		fruit.add("banana");
		System.out.println("get fruit:"+fruit.get(2) );
		fruit.set(0, "orange");
		for (String f:fruit)// changing the element
		
		
System.out.println(f);
	}

}
