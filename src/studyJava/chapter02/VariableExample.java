package studyJava.chapter02;

public class VariableExample {
	public static void main(String[] args) {
		// 1. ���� ��� ���
		int hour = 3; // ���� hour ����
		int minute = 5; // ���� minute ����

		System.out.println(hour + "�ð�" + minute + "��");

		int totalMinute = (hour * 60) + minute; // ���� hour �� minute ���� �а� ���ϰ� ���ϴ� ������� ����

		System.out.println("�� " + totalMinute + "��"); // totalMinute ���� �а� �ֿܼ� ���

		// 2. �� ������ ���� ��ȯ�ϴ� ���
		int x = 3;
		int y = 5;

		System.out.println("x : " + x + " , y : " + y);

		int temp = x; // ���ο� ���� temp ����

		x = y;
		y = temp; // x�� ����� ���� temp�� ������ �� �ٽ� y�� ����

		System.out.println("x : " + x + " , y : " + y);

	}
}
