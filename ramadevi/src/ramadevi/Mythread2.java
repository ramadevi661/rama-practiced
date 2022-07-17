package ramadevi;

public class Mythread2
{
	
	class MyThread1 extends Thread{    
		Test t;    
		MyThread1(Test t){    
		this.t=t;    
		}    
		public void run(){    
		t.printTest(5);    
		}    
		    
		}    
		class MyThread2 extends Thread{    
		Test t;    
		MyThread2(Test t){    
		this.t=t;    
		}    
		public void run(){    
		t.printTest(100);    
		}    
		}    
		    
		public class SynchronizedBlock1{    
		public static void main(String args[]){    
		Test obj = new Test();//only one object    
		MyThread1 t1=new MyThread1(obj);    
		MyThread2 t2=new MyThread2(obj);    
		t1.start();    
		t2.start();    
		}    
		}    

}
