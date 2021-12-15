package studyJava.chapter05;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		// �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��������� ���ϴ� ���α׷��� �����ض�.
		
		boolean run = true; // �ݺ����� ����, �����ų ������ ����
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-----------------------------------------------------");
			System.out.print("���� > ");
			int selectNo = Integer.parseInt(scanner.nextLine()); // scanner�ι޴� ���� int�� ��ȯ�Ѵ�.
			
			if(selectNo == 1) {
				System.out.print("�л��� > ");
				int studentCount = Integer.parseInt(scanner.nextLine());
				scores = new int[studentCount]; // �Է��� �л����� ������ �迭 ����
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("�����Է� : scores[" + i + "] > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				} 
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] > " + scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				
				for(int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				double avg = sum / scores.length;
				System.out.println("�ְ����� > " + max);
				System.out.println("������� > " + avg);
			} else if(selectNo == 5) {
				run = false; // �ݺ��� ����
			}
		}
			System.out.println("���α׷� ����");
	}
}
