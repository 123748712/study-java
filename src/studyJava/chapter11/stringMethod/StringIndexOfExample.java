package studyJava.chapter11.stringMethod;

public class StringIndexOfExample {
	public static void main(String[] args) {
		// String �޼ҵ� �������� -3
		// ���ڿ� ���� ���� ���� (indexOf())

		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location); // "�ڹ� ���α׷���" ���� "���α׷���"�� ��ġ�� �ִ� �ε��� ��ġ�� 3 �̴�.
		
		if(subject.indexOf("�ڹ�") != -1) { // "�ڹ�" ��� ã�� ���ڿ��� ���ԵǾ� �ִ� ���
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else { // "�ڹ�"��� ã�� ���ڿ��� ���ԵǾ� ���� ���� ���
			System.out.println("�ڹٿ� ���� ���� å�̱���.");
		}
		
	}
}
