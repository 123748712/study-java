package studyJava.chapter03;

import java.util.Scanner;

public class Assignment04 {
	public static void main(String[] args) {
		/* 사용자가 갖고있는 500원, 100원, 50원, 10원짜리 동전의
		 * 갯수를 입력받아 총 얼마 있는지 출력하는 프로그램을 만들어보자.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원 동전의 갯수 : ");
		int count500 = scanner.nextInt();
		int sum500 = count500 * 500; // 갖고있는 500원 동전의 합산금액
		
		System.out.print("100원 동전의 갯수 : ");
		int count100 = scanner.nextInt();
		int sum100 = count100 * 100; // 갖고있는 100원 동전의 합산금액
		
		System.out.print("50원 동전의 갯수 : ");
		int count50 = scanner.nextInt();
		int sum50 = count50 * 50; // 갖고있는 50원 동전의 합산금액
		
		System.out.print("10원 동전의 갯수 : ");
		int count10 = scanner.nextInt();
		int sum10 = count10 * 10; // 갖고있는 10원 동전의 합산금액
		
		System.out.println("총 금액 : " + (sum500 + sum100 + sum50 + sum10) + "원");
	}
}
