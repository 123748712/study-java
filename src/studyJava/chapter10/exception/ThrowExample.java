package studyJava.chapter10.exception;

import java.util.Random;
import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) throws Exception {
		/*
		 * 1. throw throw �� throws�� �ٸ��� �����ڰ� ���� ������ �����.
		 */
		Random random = new Random();
		int ranNum = random.nextInt(10) + 1; // 1���� 10 ����
		Scanner scanner = new Scanner(System.in);
		int inPutNum = scanner.nextInt();
		if (inPutNum > 10 || inPutNum <= 0) {
			// System.out.println("�߸��� �Է��Դϴ�.");
			throw new Exception("�߸��� �Է��Դϴ�."); // ������ ���� ����� �����ش�. try - catch , add throws �� ����� ����ȴ�.
		}
		if (ranNum == inPutNum) {
			System.out.println("�����Դϴ�.");
		}
	}
}
