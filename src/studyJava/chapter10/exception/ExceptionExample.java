package studyJava.chapter10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {

		/*
		 * 1. 예외처리
		 * 
		 * 프로그램이 실행되었을때 나는 에러를 정상실행될 수 있게 유지되는 것.
		 */
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("첫번째 정수 : ");
			int x = scanner.nextInt();

			System.out.println("두번째 정수 : ");
			int y = scanner.nextInt();

			int result = x + y;
			System.out.println(x + " + " + y + " = " + result);
		} catch (InputMismatchException e) { // 에러의 이름을 적어준다.
			System.out.println("정수가 아닙니다."); // 에러가 떴을시 어떻게 할지를 적어준다.
		}
		
		/*
		 * 위의 구문의 경우 정수를 입력한다면 에러는 발생하지 않는다. 하지만 소수점값을 입력하는 순간
		 * java.util.InputMismatchException 에러가 뜬다. 그 부분을 막기 위해 try - catch 문을 사용해 오류가
		 * 났을시 catch쪽으로 가게끔 한다.
		 */
	}
}
