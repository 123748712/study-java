package studyJava.chapter11.stringMethod;

public class StringCharAtExample {
	public static void main(String[] args) {
		// String �޼ҵ� �������� -1
		// �ֹε�Ϲ�ȣ���� ���ڿ� ���ڸ� �����ϴ� ���
		
		/*
		 *  ���� ���� (charAt(int index))
		 *  �Ű������� �־��� �ε����� ���ڸ� �����Ѵ�.
		 *  ��, ���ڿ����� index ��ġ�� �ִ� ���ڸ� �����Ѵ�.
		 */

		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // �ֹι�ȣ ���ڸ� ù��° ���� ����� ���� Ȥ�� ���ڸ� �����Ѵ�.
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("�����Դϴ�.");
			break;
		case '2' :
		case '4' :
			System.out.println("�����Դϴ�.");
			break;
		}
		
	}
}
