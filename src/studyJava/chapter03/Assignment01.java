package studyJava.chapter03;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		/*
		 * 실수 자료형을 이용하여 직사각형의 둘레와 면적을 구하는 프로그램을 만들어보자.
		 * 실수형 변수 width(가로), height(세로), area(넓이), perimeter(둘레)를 선언한 후
		 * Scanner 클래스를 이용해 사용자로부터 직사각형의 가로, 세로 길이를 입력받아 정확한 값을 출력하라.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이 : ");
		String width = scanner.nextLine();
		
		System.out.print("세로의 길이 : ");
		String height = scanner.nextLine();
		
		double area = (Double.parseDouble(width) * Double.parseDouble(height)); // 넓이 = 가로 * 세로
		double perimeter = (Double.parseDouble(height) + Double.parseDouble(width)) * 2; // 둘레 = (가로+세로) * 2
		
		System.out.println("직사각형의 넓이 : " + area);
		System.out.println("직사각형의 둘레 : " + perimeter);
	}
}
