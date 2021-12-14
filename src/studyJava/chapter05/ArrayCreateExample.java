package studyJava.chapter05;

public class ArrayCreateExample {
	public static void main(String[] args) {
	
		// 1. �迭
		
		int scores0 = 83;
		int scores00 = 90;
		int scores000 = 87;
		
		/* 
		 * ������ 1���� �����͸� ������ �����ϴ�.
		 * �����ؾ��� �������� ���� �������� �׸�ŭ ���� ������ �ʿ��ϰ� �ڵ尡 �������.
		 * �迭 ������ Ÿ��[] ����; or Ÿ�� ����[]; �� ���Ѵ�.
		 */
		
		// ����
		
		int[] intArray;
		double doubleArray[];
		
		
		// 2. �迭 ����
		// Ÿ��[] ���� = { ��0, ��1, ��2 ...} �� �����Ѵ�.
	
		String[] names = {"�ſ��", "ȫ�浿", "���ڹ�"};		
		System.out.println(names[1]); // 0 ���� ���� ���۵Ǿ� 2��°�� ȫ�浿�� ��µȴ�.
		
		int[] scores = {83, 90, 87};
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) { // scores.length �� ���ȣ ���� �� ������.
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / scores.length; // 3
		System.out.println("��� : " + avg);
	}
}