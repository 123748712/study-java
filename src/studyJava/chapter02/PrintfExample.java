package studyJava.chapter02;

public class PrintfExample {
	public static void main(String[] args) {

		// 1. �ý��� �Է�
		
		// System.in.read();
		
		
		// 2. �ý��� ���
		System.out.print("���"); // ��ȣ ���� ������ ��¸� �ض�.
		
		System.out.println("���"); // ��ȣ ���� ������ ����ϰ� ���� �ٲ��.
		
		System.out.printf("%s\n", "���"); // ��ȣ ���� ù��° ���ڿ� ���Ĵ�� ������ ����϶�.
		
		
		int value = 600;
		
		System.out.printf("��ǰ�� ���� : %d��\n", value); // ���� -> %d
		
		String name = "ȫ�浿";
		String job = "����";
		
		System.out.printf("%d | %s | %s", 1, name, job); // ���ڿ� -> %s
	}
}
