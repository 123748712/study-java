package studyJava.chapter05;

public class AdvencedForExample {
	public static void main(String[] args) {

		/*
		 *  향상된 for문
		 *  
		 *  향상된 for문은 루프카운터 변수와 증감식을 사용하지 않는다.
		 *  배열에서 꺼낸 항목을 저장할 변수 선언과 콜론(:), 배열을 나란히 작성한다.
		 *  배열 및 컬렉션 항목을 개수만큼 반복하고, 자동으로 for문을 빠져나온다.
		 */
		
		// 예제
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { // 배열 scores 를 전부 순회한 후 종료된다.
			sum = sum + score;
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("평균 : " + avg);
	}
}
