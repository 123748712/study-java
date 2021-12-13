package studyJava.chapter04;

import java.util.Random;

public class SwicthExample {
	public static void main(String[] args) {
		/*
		 * 1. switch�� if �ʹ� �ٸ��� � ���� �����Ŀ� ���� ���๮�� ���õȴ�. ������ ���� ���� ���๮�� �����Ǳ� ������ �ڵ尡
		 * �����ϴ�. ������ ���� ���� case�� ���� ���๮�� �����ϸ�, ������ ���� ���ٸ� default�� ����.
		 * 
		 * switch���� ������ ���� ã�� �� break; �� ���ٸ� ���� case�� ���޾� ����Ǳ� ������ ���ϴ� ���� ���๮�� �����ϰ� �ʹٸ�
		 * �� ! break; �� ��������Ѵ�.
		 */

		// �ֻ��� ������ ���� 2

		Random random = new Random();

		int randomDice = random.nextInt(6) + 1;

		switch (randomDice) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}

		String pos = "����"; // String�� ������ ���� ���� ���ǹ����� �̵��� �����Ѵ�.

		switch (pos) {
		case "����":
			System.out.println("������ 700�����̴�.");
			break;
		case "����":
			System.out.println("������ 550�����̴�.");
			break;
		case "�븮":
			System.out.println("������ 400�����̴�.");
			break;
		default:
			System.out.println("�� ���� ����� 250�����̴�.");
			break;
		}
	}
}
