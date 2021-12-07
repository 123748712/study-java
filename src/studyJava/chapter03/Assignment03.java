package studyJava.chapter03;

import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) {
		/*
		 * 원기둥 밑면의 반지름(radius)과 높이(height)를 입력 받아
		 * 밑면의 넓이(area)와 부피(volume)를 계산하는 프로그램을 작성해보자.
		 * 원주율은 Math.PI 를 사용한다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI; // 파이값
		
		System.out.print("원기둥 밑면의 반지름 : ");
		String radius = scanner.nextLine();
		
		System.out.print("원기둥의 높이 : ");
		String height = scanner.nextLine();
		
		double area = Double.parseDouble(radius) * Double.parseDouble(radius) * pi; // 원기둥 밑면의 넓이 = 반지름 * 반지름 * 파이
		double volume = area * Double.parseDouble(height); // 원기둥의 부피 = 원의 넓이 * 원기둥의 높이
		
		System.out.println("원기둥 밑면의 넓이 : " + area);
		System.out.println("원기둥의 부피 : " + volume);
	}
}
