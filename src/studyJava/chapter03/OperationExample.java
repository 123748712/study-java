package studyJava.chapter03;

public class OperationExample {
	public static void main(String[] args) {

		// 1. 연산자 ,피연산자, 연산식

		// x + y -> x, y 는 피연산자, + 는 연산자, 과정을 기술한것을 연산식 이라고 한다.
		// 연산의 우선순위가 같다면 왼쪽에서 오른쪽 (->) 으로 처리된다.
		// but, 우선순위가 낮은 연산이여도 (괄호) 안에 있다면 가장 우선이다.

		
		
		// 2. 연산자의 종류

		// x++; -> 단항 연산자
		// x + y; -> 이항 연산자
		// (sum > 90) ? "A" : "B"; -> 삼항 연산자

		// 부호 연산자 (+ , -) 정수 및 실수 타입 변수 앞에도 붙일 수 있다.
		int a = -100;
		int result1 = +a; // -100
		int result2 = -a; // +100

		// 중요한 것은 부호 연산자의 결과가 int 타입이다.
		byte b = -100;
		int result3 = -b; // byte result3 = -b 는 컴파일 에러가 발생한다.
	
		// 증감 연산자 (++ , --)
		
		int x = 1;
		int y = 1;
		int result4 = ++x + 10;
		int result5 = y++ + 10;
		
		System.out.println(result4); // x의 값인 1이 먼저 더해진 후 10이 더해져 12 출력
		System.out.println(result5); // y의 값인 1과 10이 먼저 더해진 후 y의 값이 1이 올라가 11 출력
		
		// 논리부정 연산자 (!)		
		// true를 false로, false를 true로 변환, 실행흐름을 제어하는 boolean 타입에만 사용 가능하다.
		
		boolean play = true;
		
		play = !play;
		System.out.println(play); // true -> false
		
		play = !play;
		System.out.println(play); // false -> true
		
		// 산술 연산자(+ , - , * , / , %)
		// 왼쪽 피여난자를 오른쪽 피연산자로 나눈 나머지를 구하는 연산이다.
		
		int value1 = 5;
		int value2 = 2;
		
		System.out.println(value1%value2); // 5를 2로 나누면 나머지는 1이 남아 1 출력
		
		// 비교 연산자 (< , > , <= , >= , == , !=)
		int num1 = 10;
		int num2 = 10;	
		boolean result6 = (num1 == num2); // true
		boolean result7 = (num1 != num2); // false
		
		// 논리 연산자 (&& , || , & , | , ^ , !)
		
		// && 논리곱 (AND)
		// true && true = true
		// true && false = false 둘중 하나라도 false 면 false
		
		// || 논리합 (OR)
		// true || false = true 둘중 하나라도 true 면 true
	}
}
