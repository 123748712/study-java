package studyJava.chapter04;

public class WhileExample {
	public static void main(String[] args) {
		/*
		 *  1. while ��
		 *  ���ǽ��� true ��� ���๮�� ������ �� �ٽ� ���ǽ����� ���ƿ� �ٽ� �����Ѵ�.
		 */
		
		int i = 1;
		while(i <= 10) { 			// i �� 10 ���϶�� ����
			System.out.println(i); 	// i �� ����ϰ�,
			i++; 					// i�� 1 ������Ų��.	
		}
		
		/* 2. continue ��
		 * �ݺ����� for, while �������� ���Ǵµ�, ��� ���ο���
		 * continue���� ����Ǹ� for���� ������, while���� ���ǽ����� �̵��Ѵ�.
		 */
		
		for(int n = 1; n <= 10; n++) {
			if(n%2!=0) { // i�� Ȧ���϶�,
				continue; // �ٽ� ���������� �̵��Ѵ�.
			}
			System.out.println(n); // Ȧ���� ������� ����.
		}
	}
}
