package studyJava.chapter09.anonymousClass;

public class Anonymous {
	public static void main(String[] args) {

		// 우리가 알고있는 객체 생성 방법이다.
		Person person = new Person();
		person.wake();

		Person person2 = new Person() {
			void work() {
				System.out.println("출근합니다.");
			}
			// person2 를 생성함과 동시에 work 메소드를 확장한다.
			@Override
			void wake() {
				System.out.println("10시에 일어납니다.");
			};
		};
		person2.wake();
		// person2.work(); person의 주솟값을 갖고 있기 때문에 work는 갖고 있지 않아 오류가 난다.
	}
}
