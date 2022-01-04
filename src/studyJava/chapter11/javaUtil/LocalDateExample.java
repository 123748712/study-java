package studyJava.chapter11.javaUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
	public static void main(String[] args) {
		/*
		 * �ֱٵ�� Date, Calendar Ŭ������ ���Ȼ��� ����, �پ��� ������ ������� �ʴ´�.
		 * JDK 1.8 ���� LocalDate, LocalDateTime ���� ����Ѵ�.
		 */
		System.out.println(LocalDate.now()); // ���� ��¥
		System.out.println(LocalDateTime.now()); // ���� ��¥ �� �ð�

		String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� hh:mm:ss"));
		System.out.println(now);
	}
}