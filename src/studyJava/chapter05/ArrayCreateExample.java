package studyJava.chapter05;

public class ArrayCreateExample {
	public static void main(String[] args) {
	
		// 1. 배열
		
		int scores0 = 83;
		int scores00 = 90;
		int scores000 = 87;
		
		/* 
		 * 변수는 1개의 데이터만 저장이 가능하다.
		 * 저장해야할 데이터의 수가 많아지면 그만큼 많은 변수가 필요하고 코드가 길어진다.
		 * 배열 선언은 타입[] 변수; or 타입 변수[]; 로 선한다.
		 */
		
		// 예시
		
		int[] intArray;
		double doubleArray[];
		
		
		// 2. 배열 생성
		// 타입[] 변수 = { 값0, 값1, 값2 ...} 로 생성한다.
	
		String[] names = {"신용권", "홍길동", "감자바"};		
		System.out.println(names[1]); // 0 부터 값이 시작되어 2번째인 홍길동이 출력된다.
		
		int[] scores = {83, 90, 87};
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { // scores.length 는 대괄호 안의 값 갯수다.
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length; // 3
		System.out.println("평균 : " + avg);
	}
}