package studyJava.chapter11.wrapper;

public class WrapperExample {
	public static void main(String[] args) {
		Integer integer = new Integer(10); // 10 �̶�� ������ integer�� boxing �� ��.
		int intValue = integer.intValue(); // 10 �̶�� ������ unboxing �� ��.

		Integer i = 10; // auto boxing
		int j = i; // auto unboxing
		
		// ��ü�� �����͸� ����
	}
}
