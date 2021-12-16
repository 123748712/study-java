package studyJava.chapter05;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekExample {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		DayOfWeek week = now.getDayOfWeek();
		System.out.println(now);
		Week today = null;
		
		switch(week) {
		case SUNDAY:
			today = Week.SUNDAY;
			break;
		case MONDAY:
			today = Week.MONDAY;
			break;
		case TUESDAY:
			today = Week.TUESDAY;
			break;
		case WEDNESDAY:
			today = Week.WEDNESDAY;
			break;
		case THURSDAY:
			today = Week.THURSDAY;
			break;
		case FRIDAY:
			today = Week.FRIDAY;
			break;
		case SATURDAY:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("오늘은 축구를 하는 날입니다.");
		} else {
			System.out.println("열심히 공부를 합니다.");
		}
	}
}
