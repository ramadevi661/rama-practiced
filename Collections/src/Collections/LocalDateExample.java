package Collections;
import java.time.LocalDate;
import java.time.LocalTime; 
public class LocalDateExample 
{

	public static void main(String[] args)
	{
		//   LocalDate date1 = LocalDate.of(2017, 1, 13);   
		//System.out.println(date1.isLeapYear());
	//	LocalDate date2 = LocalDate.of(2016, 1, 12);
	//	System.out.println(date2.isLeapYear());
		
		//LocalDate date = LocalDate.now();
		//LocalDate  yesterday = date.minusDays(1);
		//LocalDate tomorrow = yesterday.plusDays(2); 
		//System.out.println("today"+date);
		//System.out.println("today"+yesterday);
		//System.out.println("today"+tomorrow);
		
		  LocalTime time1 = LocalTime.of(10,43,12);  
				
			System.out.println(time1);

			  LocalTime time2  = time1. minusHours(2); 
			  LocalTime time3  = time2.minusMinutes(32);
			  System.out.println(time3);

	}

}
