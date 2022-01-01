package studyJava.chapter10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {

		/*
		 * 1. ����ó��
		 * 
		 * ���α׷��� ����Ǿ����� ���� ������ �������� �� �ְ� �����Ǵ� ��.
		 */
		try {
			Scanner scanner = new Scanner(System.in);

			System.out.println("ù��° ���� : ");
			int x = scanner.nextInt();

			System.out.println("�ι�° ���� : ");
			int y = scanner.nextInt();

			int result = x + y;
			System.out.println(x + " + " + y + " = " + result);
		} catch (InputMismatchException e) { // ������ �̸��� �����ش�.
			System.out.println("������ �ƴմϴ�."); // ������ ������ ��� ������ �����ش�.
		}
		
		/*
		 * ���� ������ ��� ������ �Է��Ѵٸ� ������ �߻����� �ʴ´�. ������ �Ҽ������� �Է��ϴ� ����
		 * java.util.InputMismatchException ������ ���. �� �κ��� ���� ���� try - catch ���� ����� ������
		 * ������ catch������ ���Բ� �Ѵ�.
		 */
	}
}
