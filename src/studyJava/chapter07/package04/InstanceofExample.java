package studyJava.chapter07.package04;

public class InstanceofExample {
	public static void main(String[] args) {
		/*
		 * 1. ���� Ÿ�� ��ȯ �θ� Ÿ���� �ڽ� Ÿ������ ��ȯ�ϴ� ��. �ڽ�Ÿ�� ���� = (�ڽ�Ÿ��) �θ�Ÿ��;
		 */

		Parent parent = new Parent();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		/*
		 * parent.field2 = "data2"; parent.method3 �� �Ұ����ϴ�.
		 */

		Child child = (Child) parent; // ����Ÿ�Ժ�ȯ �� child �޼ҵ� ��� ����
		child.field2 = "yyy";
		child.method3();

	}
}
