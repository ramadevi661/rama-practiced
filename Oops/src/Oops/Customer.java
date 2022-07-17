package Oops;

public class Customer
{
	private int age;
	public int getage()
	{
		return age;
		
	}
public void setage(int age)
{
	this.age=age;
}
	public static void main(String[] args)
	{
	
		Customer myage = new Customer();
		myage.setage(25);
		System.out.println(myage.getage());
	}

}
