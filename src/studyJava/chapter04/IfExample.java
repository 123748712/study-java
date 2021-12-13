package studyJava.chapter04;

import java.util.Random;

public class IfExample {
	public static void main(String[] args) {
		/*
		 * 1. if �� if (���ǽ�) { ���๮ 1 } �� �������� �̷���� �ִ�. ���ǽ��� true �� ���๮�� �����ϰ�, false�� ��������
		 * �ʾ� �����, boolean Ÿ�� ������ �� �� �ִ�.
		 */

		if (true) {
			System.out.println("true");
		}

		if (true)
			System.out.println("true");

		// { } ����� �����ص� ��� �����ϴ�. but, ���� ���� ���������� { } ����� �����Ѵ�.

		int score = 93;

		if (score >= 90) {
			System.out.println("������ 90������ Ů�ϴ�.");
			System.out.println("A ����Դϴ�.");
		}

		if (score < 90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("B ����Դϴ�.");
		}

		/*
		 * 2. if - else �� if���� ���ǽ��� true �� if���� ���๮�� ����ǰ�, false�� else ���๮�� ����ȴ�.
		 */

		int score1 = 85;

		if (score1 >= 90) {
			System.out.println("������ 90������ Ů�ϴ�.");
			System.out.println("A ����Դϴ�.");
		} else { // score < 90 �� ��� ����ȴ�.
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("B ����Դϴ�.");
		}

		/*
		 * 3. if - else if - else �� ó�� if���� ���ǽ��� false�� �ٸ� ���ǽ��� ����� ���� ���� ����� ������ �� �ִ�.
		 */

		// �ֻ��� ������ ����

		Random random = new Random(); // Random Ŭ���� ����

		int randomDice = random.nextInt(6) + 1; // 0���� �����ϴ� ������ ������ 6�� �ް�, 1�� ���� 1���� �����ϵ��� �����Ѵ�.

		if (randomDice == 1) {
			System.out.println("1�� ���Խ��ϴ�.");
		} else if (randomDice == 2) {
			System.out.println("2�� ���Խ��ϴ�.");
		} else if (randomDice == 3) {
			System.out.println("3�� ���Խ��ϴ�.");
		} else if (randomDice == 4) {
			System.out.println("4�� ���Խ��ϴ�.");
		} else if (randomDice == 5) {
			System.out.println("5�� ���Խ��ϴ�.");
		} else { // 1~5 ������ ���� ������ ������ ���� 6�̱� ������ else ��
			System.out.println("6�� ���Խ��ϴ�.");
		}

	}
}
