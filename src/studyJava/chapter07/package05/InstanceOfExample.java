package studyJava.chapter07.package05;

public class InstanceOfExample {

	/*
	 * 1. instanceof
	 * 
	 * 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하려면 instanceof 연산을 활용한다.
	 * 주로 매개값의 타입을 조사하는데 사용된다.
	 */
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // Child 타입으로 변환 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child 로 변환 성공");
		} else {
			System.out.println("method1 - Child 로 변환되지 않음");
		}
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA); // Child 객체를 매개값으로 전달
	}
}
