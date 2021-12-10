package studyJava.chapter04;

public class WhileExample {
	public static void main(String[] args) {
		/*
		 *  1. while 문
		 *  조건식이 true 라면 실행문을 실행한 후 다시 조건식으로 돌아와 다시 진행한다.
		 */
		
		int i = 1;
		while(i <= 10) { 			// i 가 10 이하라는 조건
			System.out.println(i); 	// i 를 출력하고,
			i++; 					// i를 1 증가시킨다.	
		}
		
		/* 2. continue 문
		 * 반복적인 for, while 문에서만 사용되는데, 블록 내부에서
		 * continue문이 실행되면 for문의 증감식, while문의 조건식으로 이동한다.
		 */
		
		for(int n = 1; n <= 10; n++) {
			if(n%2!=0) { // i가 홀수일때,
				continue; // 다시 증감식으로 이동한다.
			}
			System.out.println(n); // 홀수는 실행되지 않음.
		}
	}
}
