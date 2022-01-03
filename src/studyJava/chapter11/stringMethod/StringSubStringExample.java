package studyJava.chapter11.stringMethod;

public class StringSubStringExample {
	public static void main(String[] args) {
		// String 메소드 예제문제 -5
		// 문자열 잘라내기 (substring())

		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6); // 주어진 시작과 끝 인덱스 사이의 문자열 추출 방법
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 주어진 인덱스부터 끝까지 문자열 추출 방법
		System.out.println(secondNum);
		
	}
}
