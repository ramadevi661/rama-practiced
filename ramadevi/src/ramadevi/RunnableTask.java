package ramadevi;

public class RunnableTask {
	
	

	public static void main(String[] args) 
	{
		Multithread t = new Multithread();
	
		//Thread m = new Thread(t);
		Thread m = new Thread();//get name
		m.start();
	
	Thread.currentThread().setName("rama thrad");
	System.out.println(Thread.currentThread().getName());
	}

}
