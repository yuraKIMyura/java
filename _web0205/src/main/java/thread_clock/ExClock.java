package thread_clock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExClock {

	public static void main(String[] args) {

		System.out.println(LocalDateTime.now());
		LocalDateTime localDateTime = LocalDateTime.now();
		String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
			/*
			yyyy: Year with four digits
			MM: Month as a two-digit number
			dd: Day of the month as a two-digit number
			HH: Hour of the day in 24-hour format
			mm: Minutes of the hour
			ss: Seconds of the minute
			*/
		System.out.println(localDateTimeFormat1);
		
		
		
	}

}
