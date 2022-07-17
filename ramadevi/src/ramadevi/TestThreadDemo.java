package ramadevi;

public class TestThreadDemo {

	public static void main(String[] args)
	{
		//System.out.println(Thread.currentThread().getPriority());
		
		TestThread d= new TestThread();
		
		
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		for (int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		//Thread.currentThread().setName("rama thread");
		//System.out.println(Thread.currentThread().getName());
	}

	
}
