package Oops;

public class Rama extends Student { 
	
		  public void studentemail () {
		    super.studentemail(); 
		    System.out.println("rama email is: rama@123");
		  }
		}

		class Task 
		{
		  public static void main(String args[]) {
			  Rama myemail = new Rama(); 
		    myemail.studentemail(); 
		  }
		}