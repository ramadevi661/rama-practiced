package ramadevi;

public class ThreadTest 
{
	
public static void main(String[] args) throws InterruptedException 
{
	Mythread t = new Mythread();
	t.start();
	t.join();
	for(int i=0;i<3;i++)
	{
		System.out.println("Main thread");
	}

	}

}
