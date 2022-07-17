package Files;
import java.io.*;

public class FileWriterDemo {
						
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("E:\\Test_Projects\\Test_files\\Hello_There11.txt");
			fw.write('c');
			fw.write("\n");
			fw.write("rama");
		}
			
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			fw.flush();
			fw.close();
		}
			
		}
		
	}


