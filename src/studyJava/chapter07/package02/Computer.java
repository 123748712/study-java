package studyJava.chapter07.package02;

public class Computer extends Calculator {
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 정확한 PI 값으로 재정의
	}
}
