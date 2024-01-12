//240112 enumeration
package ch05.sec03;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //이것도 static method Class명.함수() 형태니까
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d년 %d월 %d일 \n", year, month, day);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1: today = Week.일; break;
			case 2: today = Week.월; break;
			case 3: today = Week.화; break;
			case 4: today = Week.수; break;
			case 5: today = Week.목; break;
			case 6: today = Week.금; break;
			case 7: today = Week.토; break;
		}//switch
		
		System.out.println("오늘은 "+ today +"요일");
		
		if(today == Week.일) {
			System.out.println("오늘은 놉니다.");
		}else {
			System.out.println("자바 공부를 합니다.");
		}
		
	}//main

}//class
