package part02.javaUtil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;


public class DateEx {

	public static void main(String[] args) {
	
		/**이전에 많이 쓴 형식**/
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(now));

	
		/**요즘에 많이 쓰는 형식**/
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
	
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

}
