package Collections;
import java.util.*;
public class ListToArray {

	public static void main(String[] args)
	{
		
List<String> fruitList = new ArrayList<String>();
fruitList.add("mango");
fruitList.add("banana");
//converting list elements into array
String[] array = fruitList.toArray(new String[fruitList.size()]);  

System.out.println(Arrays.toString(array));

	}

}
