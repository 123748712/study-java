package studyJava.chapter03;

import java.util.Scanner;

public class Assignment04 {
	public static void main(String[] args) {
		/* ����ڰ� �����ִ� 500��, 100��, 50��, 10��¥�� ������
		 * ������ �Է¹޾� �� �� �ִ��� ����ϴ� ���α׷��� ������.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500�� ������ ���� : ");
		int count500 = scanner.nextInt();
		int sum500 = count500 * 500; // �����ִ� 500�� ������ �ջ�ݾ�
		
		System.out.print("100�� ������ ���� : ");
		int count100 = scanner.nextInt();
		int sum100 = count100 * 100; // �����ִ� 100�� ������ �ջ�ݾ�
		
		System.out.print("50�� ������ ���� : ");
		int count50 = scanner.nextInt();
		int sum50 = count50 * 50; // �����ִ� 50�� ������ �ջ�ݾ�
		
		System.out.print("10�� ������ ���� : ");
		int count10 = scanner.nextInt();
		int sum10 = count10 * 10; // �����ִ� 10�� ������ �ջ�ݾ�
		
		System.out.println("�� �ݾ� : " + (sum500 + sum100 + sum50 + sum10) + "��");
	}
}
