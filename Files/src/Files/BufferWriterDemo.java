package Files;
import java.io.*;
public class BufferWriterDemo {

	public static void main(String[] args) throws IOException
	{
		FileWriter	fw = new FileWriter("E:\\Test_Projects\\Test_files\\Hello_There11.txt");
		
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("ab");
			bw.newLine();
			bw.write("abc");
			bw.flush();
			bw.close();
		
	}

}
