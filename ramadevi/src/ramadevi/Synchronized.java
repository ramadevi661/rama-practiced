package ramadevi;

public class Synchronized
{
void printTest(int n)
{
	synchronized(this)
	{
		for(int i=1;i<3;i++)
		{
			System.out.println(n*i);
		
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
}
