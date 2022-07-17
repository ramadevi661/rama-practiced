package Files;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class BufferReaderedDemo {

	public static void main(String[]args )throws IOException
	
	{
	FileReader fr = new FileReader("\"E:\\Test_Projects\\Test_file\\Hello_There11.txt\"");

	BufferedReader br = BufferedReader(fr);
	System.out.println(br.readLine());
	
	System.out.println();
	}

	private static BufferedReader BufferedReader(FileReader fr) {
		// TODO Auto-generated method stub
		return null;
	}

}

	