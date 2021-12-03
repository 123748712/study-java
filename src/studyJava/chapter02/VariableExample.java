package studyJava.chapter02;

public class VariableExample {
	public static void main(String[] args) {
		// 1. 변수 사용 방법
		int hour = 3; // 변수 hour 선언
		int minute = 5; // 변수 minute 선언

		System.out.println(hour + "시간" + minute + "분");

		int totalMinute = (hour * 60) + minute; // 변수 hour 과 minute 값을 읽고 곱하고 더하는 산술연산 수행

		System.out.println("총 " + totalMinute + "분"); // totalMinute 값을 읽고 콘솔에 출력

		// 2. 두 변수의 값을 교환하는 방법
		int x = 3;
		int y = 5;

		System.out.println("x : " + x + " , y : " + y);

		int temp = x; // 새로운 변수 temp 선언

		x = y;
		y = temp; // x에 저장된 값을 temp로 저장한 후 다시 y에 저장

		System.out.println("x : " + x + " , y : " + y);

	}
}
