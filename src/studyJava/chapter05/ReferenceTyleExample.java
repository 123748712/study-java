package studyJava.chapter05;

public class ReferenceTyleExample {

	public static void main(String[] args) {
		/*
		 *  ����Ÿ�� - ��ü�� ������ �����ϴ� Ÿ�� (�迭, ����, Ŭ����, �������̽�)
		 *  
		 *  �⺻Ÿ���� ���� ���� ���� �ȿ� �����Ѵ�.
		 *  ����Ÿ���� �޸��� ������ ���� �ȿ� �����Ѵ�.
		 */

		int age = 25;
		double price = 100.5;
		/*
		 *  age, double �� ���� ���� ���� �ִ�. ��, stack ������ ����ȴ�.
		 *  �׷���, ����� ����� ����� stack ���� ���ŵȴ�.
		 */
		
		String name = "�ſ��";
		String hobby = "����";
		// �� ������ String ��ü ���� ���� ������ �ִ�. ��, heap ������ ����ȴ�.
		
		
		// ���ڿ� ��
		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";

		if(strVar1 == strVar2) {	
			System.out.println("strVar1 �� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1 �� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 �� strVar2�� ���ڿ��� ����");
		}
		
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		// �ٸ� heap ������ ����Ǿ��� ������ �����ϴ� ������ �ٸ���.
		// �׷��� ���� ���ڿ� ���� equals() �޼ҵ带 �̿��ϸ� ������ ���ڿ��� �ν��Ѵ�.
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1 �� strVar2�� ������ ����");
		} else {
			System.out.println("strVar1 �� strVar2�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1 �� strVar2�� ���ڿ��� ����");
		}
	}

}
