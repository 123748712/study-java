package studyJava.chapter10.exception;

import java.util.Random;
import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) throws Exception {
		/*
		 * 1. throw throw 는 throws와 다르게 개발자가 직접 오류를 만든다.
		 */
		Random random = new Random();
		int ranNum = random.nextInt(10) + 1; // 1부터 10 사이
		Scanner scanner = new Scanner(System.in);
		int inPutNum = scanner.nextInt();
		if (inPutNum > 10 || inPutNum <= 0) {
			// System.out.println("잘못된 입력입니다.");
			throw new Exception("잘못된 입력입니다."); // 에러를 직접 만들어 던져준다. try - catch , add throws 를 해줘야 실행된다.
		}
		if (ranNum == inPutNum) {
			System.out.println("정답입니다.");
		}
	}
}
