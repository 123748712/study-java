package studyJava.chapter06;

public class Calculator {

	// �޼ҵ�

	void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	static int plus(int x, int y) { // static �������� ��� Ŭ�������� ����ϴ� �޼ҵ带 �����Ѵ�.
		int result = x + y;
		return result;
	}

	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
}
