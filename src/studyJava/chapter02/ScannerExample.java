package studyJava.chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		// 1. Scanner ���� ���� �� �Է¹ް� ������ ����

		// Scanner scanner = new Scanner(System.in);
		// Scanner scanner -> scanner ���� ����
		// new Scanner(System.in) -> �ý����� �Է� ��ġ�κ��� �д� Scanner ����

		// String command = scanner.nextLine();
		// scanner.nextLine() -> Enter Ű �������� �Էµ� ���ڿ��� �д´�.
		// �� �� ���� ���ڿ��� String ������ �����Ѵ�.

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		int num1 = scanner.nextInt();
		
		System.out.print("�ι�° �� : ");
		int num2 = scanner.nextInt();
		
		int result = num1 + num2;
		System.out.println("���� ��� : " + result);
	}
}
