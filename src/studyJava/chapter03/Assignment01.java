package studyJava.chapter03;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		/*
		 * �Ǽ� �ڷ����� �̿��Ͽ� ���簢���� �ѷ��� ������ ���ϴ� ���α׷��� ������.
		 * �Ǽ��� ���� width(����), height(����), area(����), perimeter(�ѷ�)�� ������ ��
		 * Scanner Ŭ������ �̿��� ����ڷκ��� ���簢���� ����, ���� ���̸� �Է¹޾� ��Ȯ�� ���� ����϶�.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���� : ");
		String width = scanner.nextLine();
		
		System.out.print("������ ���� : ");
		String height = scanner.nextLine();
		
		double area = (Double.parseDouble(width) * Double.parseDouble(height)); // ���� = ���� * ����
		double perimeter = (Double.parseDouble(height) + Double.parseDouble(width)) * 2; // �ѷ� = (����+����) * 2
		
		System.out.println("���簢���� ���� : " + area);
		System.out.println("���簢���� �ѷ� : " + perimeter);
	}
}
