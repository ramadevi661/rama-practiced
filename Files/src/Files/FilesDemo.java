package Files;
import java.io.*;
public class FilesDemo {

	public static void main(String[] args) throws IOException
	{
	File f = new File("E:\\Test_Projects\\Test_files\\Hello_There11.txt");
	
		System.out.println(f.exists());
	
		System.out.println(f.createNewFile());
		System.out.println(f.exists());
		File f1 = new File("demo11 folder");
		System.out.println(f1.exists());
		System.out.println(f1.mkdirs());
		System.out.println(f1.exists());
		File f2 = new File("\"E:\\Test_Projects");
		String  filesName[]= f2.list();
		for(String s:filesName)
		{
			System.out.println(s);
		}

	}

}
