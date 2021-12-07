package studyJava.chapter03;

public class OperationExample {
	public static void main(String[] args) {

		// 1. ������ ,�ǿ�����, �����

		// x + y -> x, y �� �ǿ�����, + �� ������, ������ ����Ѱ��� ����� �̶�� �Ѵ�.
		// ������ �켱������ ���ٸ� ���ʿ��� ������ (->) ���� ó���ȴ�.
		// but, �켱������ ���� �����̿��� (��ȣ) �ȿ� �ִٸ� ���� �켱�̴�.

		
		
		// 2. �������� ����

		// x++; -> ���� ������
		// x + y; -> ���� ������
		// (sum > 90) ? "A" : "B"; -> ���� ������

		// ��ȣ ������ (+ , -) ���� �� �Ǽ� Ÿ�� ���� �տ��� ���� �� �ִ�.
		int a = -100;
		int result1 = +a; // -100
		int result2 = -a; // +100

		// �߿��� ���� ��ȣ �������� ����� int Ÿ���̴�.
		byte b = -100;
		int result3 = -b; // byte result3 = -b �� ������ ������ �߻��Ѵ�.
	
		// ���� ������ (++ , --)
		
		int x = 1;
		int y = 1;
		int result4 = ++x + 10;
		int result5 = y++ + 10;
		
		System.out.println(result4); // x�� ���� 1�� ���� ������ �� 10�� ������ 12 ���
		System.out.println(result5); // y�� ���� 1�� 10�� ���� ������ �� y�� ���� 1�� �ö� 11 ���
		
		// ������ ������ (!)		
		// true�� false��, false�� true�� ��ȯ, �����帧�� �����ϴ� boolean Ÿ�Կ��� ��� �����ϴ�.
		
		boolean play = true;
		
		play = !play;
		System.out.println(play); // true -> false
		
		play = !play;
		System.out.println(play); // false -> true
		
		// ��� ������(+ , - , * , / , %)
		// ���� �ǿ����ڸ� ������ �ǿ����ڷ� ���� �������� ���ϴ� �����̴�.
		
		int value1 = 5;
		int value2 = 2;
		
		System.out.println(value1%value2); // 5�� 2�� ������ �������� 1�� ���� 1 ���
		
		// �� ������ (< , > , <= , >= , == , !=)
		int num1 = 10;
		int num2 = 10;	
		boolean result6 = (num1 == num2); // true
		boolean result7 = (num1 != num2); // false
		
		// �� ������ (&& , || , & , | , ^ , !)
		
		// && ���� (AND)
		// true && true = true
		// true && false = false ���� �ϳ��� false �� false
		
		// || ���� (OR)
		// true || false = true ���� �ϳ��� true �� true
	}
}
