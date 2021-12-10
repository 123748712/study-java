package studyJava.chapter04;

public class ForExample {
	public static void main(String[] args) {
		/*
		 * 1. for문
		 * for문은 반복문이며 어떤 작업이 반복적으로 실행되도록 할 때 사용된다.
		 */

		// for(초기화식, 조건식, 증감식) {
		// 			실행문  }
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) { // int i 가 1부터 10 이하까지 1을 증가시킨다.
			sum = sum + i; // sum += i 와 동일
		}
		System.out.println(sum); // 1부터 10까지 전부 더한다.
		
		
		
		// 중첩 for문
		
		// 구구단 출력 예제
		
		for(int m = 2; m <= 9; m++) { //2단부터 시작하기 때문에 m 변수를 2로 설정
			System.out.println("==== " + m +"단 ====");
			for (int n = 1; n <=9; n++) {
				System.out.println(m + "x" + n + "=" + m*n);
			}
		}
	}
}
