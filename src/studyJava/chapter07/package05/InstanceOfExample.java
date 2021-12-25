package studyJava.chapter07.package05;

public class InstanceOfExample {

	/*
	 * 1. instanceof
	 * 
	 * �θ� ������ �����ϴ� ��ü�� �θ� ��ü���� �ڽ� ��ü���� Ȯ���Ϸ��� instanceof ������ Ȱ���Ѵ�.
	 * �ַ� �Ű����� Ÿ���� �����ϴµ� ���ȴ�.
	 */
	public static void method1(Parent parent) {
		if (parent instanceof Child) { // Child Ÿ������ ��ȯ �������� Ȯ��
			Child child = (Child) parent;
			System.out.println("method1 - Child �� ��ȯ ����");
		} else {
			System.out.println("method1 - Child �� ��ȯ���� ����");
		}
	}

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA); // Child ��ü�� �Ű������� ����
	}
}
