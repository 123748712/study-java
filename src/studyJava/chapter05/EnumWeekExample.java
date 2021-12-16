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
		System.out.println("���� ���� : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("������ �౸�� �ϴ� ���Դϴ�.");
		} else {
			System.out.println("������ ���θ� �մϴ�.");
		}
	}
}
