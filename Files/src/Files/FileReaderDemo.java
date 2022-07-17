package Files;
import java.io.*;
public class FileReaderDemo {

	public static void main(String[] args) throws IOException
	
	{

		FileReader fr = new FileReader ("E:\\Test_Projects\\Test_files\\Hello_There11.txt");
		int i =  fr.read();
		while(i != -1)
		{
			System.out.println(i);
			System.out.println((char)i);
			i= fr.read();
		}

	}

}
