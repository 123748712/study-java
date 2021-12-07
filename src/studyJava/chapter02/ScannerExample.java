package studyJava.chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		// 1. Scanner 변수 선언 후 입력받고 변수에 저장

		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner -> scanner 변수 선언
		// new Scanner(System.in) -> 시스템의 입력 장치로부터 읽는 Scanner 생성

		// String command = scanner.nextLine();
		// scanner.nextLine() -> Enter 키 이전까지 입력된 문자열을 읽는다.
		// 그 후 읽은 문자열을 String 변수에 저장한다.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 수 : ");
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
	}
}
