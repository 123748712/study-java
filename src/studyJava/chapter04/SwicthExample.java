package studyJava.chapter04;

import java.util.Random;

public class SwicthExample {
	public static void main(String[] args) {
		/*
		 * 1. switch문 if 와는 다르게 어떤 값을 갖느냐에 따라 실행문이 선택된다. 변수의 값에 따라 실행문이 결정되기 때문에 코드가
		 * 간결하다. 동일한 값을 갖는 case로 가서 샐행문을 실행하며, 동일한 값이 없다면 default로 간다.
		 * 
		 * switch문은 동일한 값을 찾은 후 break; 가 없다면 다음 case가 연달아 실행되기 때문에 원하는 값의 실행문만 실행하고 싶다면
		 * 꼭 ! break; 를 적어줘야한다.
		 */

		// 주사위 굴리기 예제 2

		Random random = new Random();

		int randomDice = random.nextInt(6) + 1;

		switch (randomDice) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}

		String pos = "과장"; // String도 동일한 값을 같는 조건문으로 이동해 실행한다.

		switch (pos) {
		case "부장":
			System.out.println("월급은 700만원이다.");
			break;
		case "과장":
			System.out.println("월급은 550만원이다.");
			break;
		case "대리":
			System.out.println("월급은 400만원이다.");
			break;
		default:
			System.out.println("그 이하 사원은 250만원이다.");
			break;
		}
	}
}
