package studyJava.chapter10.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		/*
		 * 1. throws
		 * throws Ű���带 �̿��� ���ܸ� ���ѱ� �� �ִµ� �ᱹ JVM�� ���������� ����ó���� �ϰ� �ȴ�.
		 */
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void findClass() throws ClassNotFoundException { // �޼��� �ڿ� throws Ű���带 �̿��Ѵ�.
		Class clazz = Class.forName("java.lang.String2");
	}
}