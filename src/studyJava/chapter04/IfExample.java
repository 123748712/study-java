package studyJava.chapter04;

import java.util.Random;

public class IfExample {
	public static void main(String[] args) {
		/*
		 * 1. if 문 if (조건식) { 실행문 1 } 의 형식으로 이루어져 있다. 조건식이 true 면 실행문을 실행하고, false면 실행하지
		 * 않아 연산식, boolean 타입 변수가 올 수 있다.
		 */

		if (true) {
			System.out.println("true");
		}

		if (true)
			System.out.println("true");

		// { } 블록을 생략해도 사용 가능하다. but, 좋지 못한 가독성으로 { } 사용을 권장한다.

		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("A 등급입니다.");
		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B 등급입니다.");
		}

		/*
		 * 2. if - else 문 if문의 조건식이 true 면 if문의 실행문이 실행되고, false면 else 실행문이 실행된다.
		 */

		int score1 = 85;

		if (score1 >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("A 등급입니다.");
		} else { // score < 90 일 경우 실행된다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("B 등급입니다.");
		}

		/*
		 * 3. if - else if - else 문 처음 if문의 조건식이 false면 다른 조건식의 결과에 따라 실행 블록을 선택할 수 있다.
		 */

		// 주사위 굴리기 예제

		Random random = new Random(); // Random 클래스 생성

		int randomDice = random.nextInt(6) + 1; // 0부터 시작하는 랜덤한 정수를 6개 받고, 1을 더해 1부터 시작하도록 설정한다.

		if (randomDice == 1) {
			System.out.println("1이 나왔습니다.");
		} else if (randomDice == 2) {
			System.out.println("2가 나왔습니다.");
		} else if (randomDice == 3) {
			System.out.println("3이 나왔습니다.");
		} else if (randomDice == 4) {
			System.out.println("4가 나왔습니다.");
		} else if (randomDice == 5) {
			System.out.println("5가 나왔습니다.");
		} else { // 1~5 까지의 수를 제외한 나머지 수는 6이기 떄문에 else 상뇽
			System.out.println("6이 나왔습니다.");
		}

	}
}
