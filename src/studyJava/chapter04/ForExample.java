package studyJava.chapter04;

public class ForExample {
	public static void main(String[] args) {
		/*
		 * 1. for��
		 * for���� �ݺ����̸� � �۾��� �ݺ������� ����ǵ��� �� �� ���ȴ�.
		 */

		// for(�ʱ�ȭ��, ���ǽ�, ������) {
		// 			���๮  }
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) { // int i �� 1���� 10 ���ϱ��� 1�� ������Ų��.
			sum = sum + i; // sum += i �� ����
		}
		System.out.println(sum); // 1���� 10���� ���� ���Ѵ�.
		
		
		
		// ��ø for��
		
		// ������ ��� ����
		
		for(int m = 2; m <= 9; m++) { //2�ܺ��� �����ϱ� ������ m ������ 2�� ����
			System.out.println("==== " + m +"�� ====");
			for (int n = 1; n <=9; n++) {
				System.out.println(m + "x" + n + "=" + m*n);
			}
		}
	}
}
