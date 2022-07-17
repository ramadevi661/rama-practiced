package ramadevi;

public class Mythread extends Thread
{
	public void start()
{
		super.start();
	System.out.println("runnig fast");
}

public void run()
{
for(int i=0;i<4;i++)
{
	try
	{
		Thread.sleep(10);
	}
catch(InterruptedException e)
	{
		
	}
	Thread.yield();
	System.out.println("child thrad");
}
}
}


