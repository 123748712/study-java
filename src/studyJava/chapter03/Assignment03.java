package studyJava.chapter03;

import java.util.Scanner;

public class Assignment03 {
	public static void main(String[] args) {
		/*
		 * ����� �ظ��� ������(radius)�� ����(height)�� �Է� �޾�
		 * �ظ��� ����(area)�� ����(volume)�� ����ϴ� ���α׷��� �ۼ��غ���.
		 * �������� Math.PI �� ����Ѵ�.
		 */
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI; // ���̰�
		
		System.out.print("����� �ظ��� ������ : ");
		String radius = scanner.nextLine();
		
		System.out.print("������� ���� : ");
		String height = scanner.nextLine();
		
		double area = Double.parseDouble(radius) * Double.parseDouble(radius) * pi; // ����� �ظ��� ���� = ������ * ������ * ����
		double volume = area * Double.parseDouble(height); // ������� ���� = ���� ���� * ������� ����
		
		System.out.println("����� �ظ��� ���� : " + area);
		System.out.println("������� ���� : " + volume);
	}
}
