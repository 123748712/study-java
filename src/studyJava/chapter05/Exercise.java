package studyJava.chapter05;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		// 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균점수를 구하는 프로그램을 구현해라.
		
		boolean run = true; // 반복문을 실행, 종료시킬 논리변수 선언
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scanner.nextLine()); // scanner로받는 값을 int로 변환한다.
			
			if(selectNo == 1) {
				System.out.print("학생수 > ");
				int studentCount = Integer.parseInt(scanner.nextLine());
				scores = new int[studentCount]; // 입력한 학생수를 저장할 배열 생성
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("점수입력 : scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				} 
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				double avg = sum / scores.length;
				System.out.println("최고점수 > " + max);
				System.out.println("평균점수 > " + avg);
			} else if(selectNo == 5) {
				run = false; // 반복문 종료
			}
		}
			System.out.println("프로그램 종료");
	}
}
