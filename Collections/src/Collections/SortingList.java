package Collections;
import java.util.*;
public class SortingList {

	private static Object collection;

	public static void main(String[] args)
	{
	List<String> al = new ArrayList<>();
	al.add("monkey");
	al.add("cat");
	al.add("Rat");
Collections.sort(al);
for(String s:al)
System.out.println(s);
System.out.println("sorting numbers..:");
List<Integer> list = new ArrayList<Integer>();
list.add(11);
list.add(5);
list.add(3);
Collections.sort(list);

	for(Integer i:list)
		System.out.println(i);
	}

}
