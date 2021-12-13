package studyJava.chapter05;

public class ReferenceTyleExample {

	public static void main(String[] args) {
		/*
		 *  참조타입 - 객체의 번지를 참조하는 타입 (배열, 열거, 클래스, 인터페이스)
		 *  
		 *  기본타입은 실제 값을 변수 안에 저장한다.
		 *  참조타입은 메모리의 번지를 변수 안에 저장한다.
		 */

		int age = 25;
		double price = 100.5;
		/*
		 *  age, double 은 직접 값을 갖고 있다. 즉, stack 영역에 저장된다.
		 *  그러나, 선언된 블록을 벗어나면 stack 에서 제거된다.
		 */
		
		String name = "신용권";
		String hobby = "독서";
		// 힙 영역의 String 객체 번지 값을 가지고 있다. 즉, heap 영역에 저장된다.
		
		
		// 문자열 비교
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if(strVar1 == strVar2) {	
			System.out.println("strVar1 과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 strVar2는 문자열이 같음");
		}
		
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		// 다른 heap 영역에 저장되었기 때문에 참조하는 영역이 다른다.
		// 그러나 내부 문자열 비교인 equals() 메소드를 이용하면 동일한 문자열로 인식한다.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1 과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1 과 strVar2는 문자열이 같음");
		}
	}

}
