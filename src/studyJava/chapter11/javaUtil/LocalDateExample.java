package studyJava.chapter11.javaUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		/*
		 * 최근들어 Date, Calendar 클래스는 보안상의 문제, 다양한 오류로 사용하지 않는다.
		 * JDK 1.8 이후 LocalDate, LocalDateTime 으로 사용한다.
		 */
		System.out.println(LocalDate.now()); // 현재 날짜
		System.out.println(LocalDateTime.now()); // 현재 날짜 및 시간

		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss"));
		System.out.println(now);
	}
}