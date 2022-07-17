package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDemo {

	public static void main(String[] args)
	{
		Student s = new Student("rama",12345,25);
		Student s1 = new Student("ramaq",123454,24);
		Student s2 = new Student("ramad",1235,22);
		ArrayList<Student> al = new ArrayList<>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			
			Student st = (Student)itr.next();
			System.out.println(st.name+" "+st.rollno+" ");
			
		}

	}

}
