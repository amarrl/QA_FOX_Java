package DateExmp;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		//String a=date.toString();
		System.out.println(date);
		
		//If i don't want to print in the above format we have to use SimpleDateFormat
		
		SimpleDateFormat d=new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss ");
		String formatedDate=d.format(date);
		
		System.out.println(formatedDate);
		
		LocalDate date2=LocalDate.now();
		
		System.out.println(date2.getYear());
		
		System.out.println(date2.getMonth());
		
		System.out.println(date2.getDayOfMonth());
		
		
		

	}

}
