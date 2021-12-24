package studyJava.chapter07.package04;

public class InstanceofExample {
	public static void main(String[] args) {
		/*
		 * 1. 강제 타입 변환 부모 타입을 자식 타입으로 변환하는 것. 자식타입 변수 = (자식타입) 부모타입;
		 */

		Parent parent = new Parent();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		/*
		 * parent.field2 = "data2"; parent.method3 은 불가능하다.
		 */

		Child child = (Child) parent; // 강제타입변환 후 child 메소드 사용 가능
		child.field2 = "yyy";
		child.method3();

	}
}
