package studyJava.chapter05;

public class AdvencedForExample {
	public static void main(String[] args) {

		/*
		 *  ���� for��
		 *  
		 *  ���� for���� ����ī���� ������ �������� ������� �ʴ´�.
		 *  �迭���� ���� �׸��� ������ ���� ����� �ݷ�(:), �迭�� ������ �ۼ��Ѵ�.
		 *  �迭 �� �÷��� �׸��� ������ŭ �ݺ��ϰ�, �ڵ����� for���� �������´�.
		 */
		
		// ����
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { // �迭 scores �� ���� ��ȸ�� �� ����ȴ�.
			sum = sum + score;
		}
		System.out.println("���� : " + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("��� : " + avg);
	}
}
