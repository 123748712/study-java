package studyJava.chapter06;

public class Calculator {

	// 메소드

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	static int plus(int x, int y) { // static 선언으로 어느 클래스에서 사용하던 메소드를 공유한다.
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
