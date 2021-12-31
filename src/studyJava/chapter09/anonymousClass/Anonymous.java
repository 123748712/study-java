package studyJava.chapter09.anonymousClass;

public class Anonymous {
	public static void main(String[] args) {

		// �츮�� �˰��ִ� ��ü ���� ����̴�.
		Person person = new Person();
		person.wake();

		Person person2 = new Person() {
			void work() {
				System.out.println("����մϴ�.");
			}
			// person2 �� �����԰� ���ÿ� work �޼ҵ带 Ȯ���Ѵ�.
			@Override
			void wake() {
				System.out.println("10�ÿ� �Ͼ�ϴ�.");
			};
		};
		person2.wake();
		// person2.work(); person�� �ּڰ��� ���� �ֱ� ������ work�� ���� ���� �ʾ� ������ ����.
	}
}
