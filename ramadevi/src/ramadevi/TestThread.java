package ramadevi;

public class TestThread extends Thread
{
public void run() 
{
	for(int i=0;i<3;i++)
	{
		Thread.yield();
		System.out.println("child thread");
	}
	
}
}